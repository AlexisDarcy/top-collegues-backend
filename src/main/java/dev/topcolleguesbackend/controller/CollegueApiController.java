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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.topcolleguesbackend.entite.Collegue;
import dev.topcolleguesbackend.model.VoteActionIhm;
import dev.topcolleguesbackend.repository.CollegueRepository;
import dev.topcolleguesbackend.service.VoteService;

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


	@GetMapping
	public List<Collegue> listerCollegue() {
		return this.collegueRepository.findAll();
	}

	@PatchMapping(path = { "/{name}" })
	public Collegue scoreCollegue(@PathVariable("name") String name, @RequestBody VoteActionIhm action) {
		Collegue updateCollegue = new Collegue();
		if (this.collegueRepository.existsByNom(name)) {
			updateCollegue = this.collegueRepository.findByNom(name);
			updateCollegue = VoteService.GestionScore(updateCollegue, action);
		}
		this.collegueRepository.save(updateCollegue);
		return updateCollegue;
	}

}

