/**
 * 
 */
package dev.topcolleguesbackend.listener;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import dev.topcolleguesbackend.entite.Collegue;
import dev.topcolleguesbackend.repository.CollegueRepository;

/**
 * @author Alexis Darcy
 *
 */
@Component
public class StartUpAppListener {

	@Autowired
	private CollegueRepository collegueRepository;

	@EventListener(ContextRefreshedEvent.class)
	@Transactional
	public void contextRefreshedEvent() {
		if (collegueRepository.count() == 0) {
			List<Collegue> listeCollegue = new ArrayList<>();

			listeCollegue.add(new Collegue("D052", "Dio-Sama", "Dio", "Brando",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/dio-brando-jojos-bizarre-adventure-all-star-battle-22.2.jpg",
					"dio-sama@leplusbeau.com", "Londres"));
			listeCollegue.add(new Collegue("Jo251", "Jonathan Joestar", "Jonathan", "Joestar",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/jonathan-joestar-jojos-bizarre-adventure-all-star-battle-81.5.jpg",
					"jonathan-joestar@lehero.com", "Londres"));
			listeCollegue.add(new Collegue("Jo281", "Jotaro Kujo", "Jotaro", "Kujo",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/jotaro-kujo-jojos-bizarre-adventure-all-star-battle-9.02.jpg",
					"jotaro-kujo@letaciturne.com", "Japon"));
			listeCollegue.add(new Collegue("Jo211", "Joseph Joestar", "Joseph", "Joestar",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/joseph-joestar-jojos-bizarre-adventure-all-star-battle-5.35.jpg",
					"joseph-joestar@ohmygod.com", "Londres"));
			listeCollegue.add(new Collegue("K25455", "Kars", "Kars", "L'être parfait",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/kars-jojos-bizarre-adventure-all-star-battle-47.jpg",
					"kars@letreparfait.com", "Mexique"));
			listeCollegue.add(new Collegue("Ze4152", "Will A Zeppeli", "Will", "A Zeppeli",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/will-a-zeppeli-jojos-bizarre-adventure-all-star-battle-91.9.jpg",
					"will-a-zeppeli@legentleman.com", "Italie"));
			listeCollegue.add(new Collegue("Ze44482", "Caesar Anthonio Zeppeli", "Caesar", " Anthonio Zeppeli",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/caesar-anthonio-zeppeli-jojos-bizarre-adventure-all-star-battle-4.02.jpg",
					"caesar-anthonio-zeppeli@lesavonneux.com", "Italie"));
			listeCollegue.add(new Collegue("Li4152", "Lisa Lisa", "Lisa", "Joestar",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/lisa-lisa-jojos-bizarre-adventure-all-star-battle-8.3.jpg",
					"lisa-lisa@laprof.com", "Londres"));
			listeCollegue.add(new Collegue("Mo25218", "Mohammed Avdol", "Mohammed", "Avdol",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/mohammed-avdol-jojos-bizarre-adventure-all-star-battle-30.6.jpg",
					"mohammed-avdol@lesage.com", "Egypte"));
			listeCollegue.add(new Collegue("Po42552", "Jean-Pierre Polnareff", "Jean-Pierre", "Polnareff",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/jean-pierre-polnareff-jojos-bizarre-adventure-all-star-battle-97.1.jpg",
					"jeanpierre-polnareff@vivelafrance.com", "Paris"));
			listeCollegue.add(new Collegue("No5422", "Noriaki Kakyoin", "Noriaki", "Kakyoin",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/noriaki-kakyoin-jojos-bizarre-adventure-all-star-battle-5.16.jpg",
					"noriaki-kakyoin@lesociopathe.com", "Japon"));
			listeCollegue.add(new Collegue("Ig415", "Iggy", "Iggy", "Le chien",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/iggy-jojos-bizarre-adventure-all-star-battle-5.jpg",
					"iggy@lechien.com", "Egypte"));
			listeCollegue.add(new Collegue("Es452", "Esidisi", "Esidisi", "L'homme du pilier",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/esidisi-jojos-bizarre-adventure-all-star-battle-83.5.jpg",
					"esidisi@lesanguin.com", "Mexique"));
			listeCollegue.add(new Collegue("Wa452", "Wamuu", "Wamuu", "L'homme du pilier",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/wamuu-jojos-bizarre-adventure-all-star-battle-1.14.jpg",
					"wamuu@latempete.com", "Mexique"));
			listeCollegue.add(new Collegue("Jo152", "Joline Cujoh", "Joline", "Cujoh",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/jolyne-cujoh-jojos-bizarre-adventure-all-star-battle-3.46.jpg",
					"joline-cujoh@leprisonnier.com", "Japon"));

			listeCollegue.forEach(collegueRepository::save);

		}
	}
}
