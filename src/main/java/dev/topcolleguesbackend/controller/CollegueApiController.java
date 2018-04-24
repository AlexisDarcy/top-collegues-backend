/**
 * 
 */
package dev.topcolleguesbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.topcolleguesbackend.entite.Collegue;
import dev.topcolleguesbackend.model.ViewCollegue;
import dev.topcolleguesbackend.model.VoteActionIhm;
import dev.topcolleguesbackend.repository.CollegueRepository;
import dev.topcolleguesbackend.service.CollegueService;

/**
 * @author Alexis Darcy
 *
 */
@RestController
@CrossOrigin
@RequestMapping("/api/collegue")
public class CollegueApiController {

	@Autowired
	private CollegueRepository collegueRepository;

	@Autowired
	private CollegueService collegueService;


	@GetMapping
	public List<Collegue> listerCollegue() {
		return this.collegueRepository.findAll();
	}

	@GetMapping(path = { "/top" })
	public List<Collegue> TopCollegue() {
		return this.collegueRepository.findTop4ByOrderByScoreDesc();
	}

	@GetMapping(path = { "/flop" })
	public List<Collegue> FlopCollegue() {
		return this.collegueRepository.findTop4ByOrderByScoreAsc();
	}

	@GetMapping(path = { "/{pseudo}" })
	public Collegue afficherCollegue(@PathVariable("pseudo") String pseudo) {
		Collegue collegue = new Collegue();
		if (!pseudo.isEmpty()) {
			collegue = this.collegueRepository.findByPseudo(pseudo);
		}
		return collegue;
	}

	@PatchMapping(path = { "/{pseudo}" })
	public Collegue scoreCollegue(@PathVariable("pseudo") String pseudo, @RequestBody VoteActionIhm action) {
		Collegue updateCollegue = new Collegue();
		updateCollegue = collegueService.GestionScore(pseudo, action);
		return updateCollegue;
	}
	
	@PostMapping(path = { "/nouveau" })
	public void ajouterCollegue(@RequestBody ViewCollegue newCollegue) {
		if (newCollegue != null) {
			collegueService.GestionCollegue(newCollegue);
		}
	}
}

