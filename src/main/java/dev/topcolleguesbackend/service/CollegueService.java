/**
 * 
 */
package dev.topcolleguesbackend.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dev.topcolleguesbackend.entite.Collegue;
import dev.topcolleguesbackend.model.ApiCollegue;
import dev.topcolleguesbackend.model.Avis;
import dev.topcolleguesbackend.model.ViewCollegue;
import dev.topcolleguesbackend.model.VoteActionIhm;
import dev.topcolleguesbackend.repository.CollegueRepository;

/**
 * @author Alexis Darcy
 *
 */
@Service
public class CollegueService {

	@Autowired
	private CollegueRepository collegueRepository;

	private String url = "http://collegues-api.cleverapps.io/collegues";

	public Collegue GestionScore(String pseudo, VoteActionIhm action) {
		Collegue updateCollegue = new Collegue();
		if (this.collegueRepository.existsByPseudo(pseudo)) {
			updateCollegue = this.collegueRepository.findByPseudo(pseudo);
			if (action.getAction().equals(Avis.AIMER)) {
				if (updateCollegue.getScore() < 1000) {
					if (updateCollegue.getScore() == 995) {
						updateCollegue.setScore(updateCollegue.getScore() + 5);
					}
					else {
						updateCollegue.setScore(updateCollegue.getScore() + 10);
					}
				}
			} else {
				if (updateCollegue.getScore() > -1000) {
					updateCollegue.setScore(updateCollegue.getScore() - 5);
				}
			}
		}
		this.collegueRepository.save(updateCollegue);
		return updateCollegue;
	}

	public void GestionCollegue(ViewCollegue newCollegue) {

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ApiCollegue[]> response  = restTemplate.getForEntity(url, ApiCollegue[].class);
		List<ApiCollegue> listApiCollegue = Arrays.asList(response.getBody());
		
		Optional<ApiCollegue> collegueTrouve = listApiCollegue.stream()
				.filter((ApiCollegue col) -> col.getMatricule().equals(newCollegue.getMatricule())).findFirst();

		collegueTrouve.ifPresent(c -> {
			Collegue collegue = new Collegue(c.getMatricule(), newCollegue.getPseudo(), c.getPrenom(), c.getNom(),
					c.getPhoto(), c.getEmail(), c.getAdresse());
			this.collegueRepository.save(collegue);
		});
	}
}
