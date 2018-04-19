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

			listeCollegue.add(new Collegue("Dio-Sama",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/dio-brando-jojos-bizarre-adventure-all-star-battle-22.2.jpg"));
			listeCollegue.add(new Collegue("Jonathan Joestar",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/jonathan-joestar-jojos-bizarre-adventure-all-star-battle-81.5.jpg"));
			listeCollegue.add(new Collegue("Jotaro Kujo",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/jotaro-kujo-jojos-bizarre-adventure-all-star-battle-9.02.jpg"));
			listeCollegue.add(new Collegue("Joseph Joestar",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/joseph-joestar-jojos-bizarre-adventure-all-star-battle-5.35.jpg"));
			listeCollegue.add(new Collegue("Kars",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/kars-jojos-bizarre-adventure-all-star-battle-47.jpg"));
			listeCollegue.add(new Collegue("Will A Zeppeli",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/will-a-zeppeli-jojos-bizarre-adventure-all-star-battle-91.9.jpg"));
			listeCollegue.add(new Collegue("Caesar Anthonio Zeppeli",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/caesar-anthonio-zeppeli-jojos-bizarre-adventure-all-star-battle-4.02.jpg"));
			listeCollegue.add(new Collegue("Lisa Lisa",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/lisa-lisa-jojos-bizarre-adventure-all-star-battle-8.3.jpg"));
			listeCollegue.add(new Collegue("Mohammed Avdol",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/mohammed-avdol-jojos-bizarre-adventure-all-star-battle-30.6.jpg"));
			listeCollegue.add(new Collegue("Jean Pierre Polnareff",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/jean-pierre-polnareff-jojos-bizarre-adventure-all-star-battle-97.1.jpg"));
			listeCollegue.add(new Collegue("Noriaki Kakyoin",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/noriaki-kakyoin-jojos-bizarre-adventure-all-star-battle-5.16.jpg"));
			listeCollegue.add(new Collegue("Iggy",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/iggy-jojos-bizarre-adventure-all-star-battle-5.jpg"));
			listeCollegue.add(new Collegue("Esidisi",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/esidisi-jojos-bizarre-adventure-all-star-battle-83.5.jpg"));
			listeCollegue.add(new Collegue("Wamuu",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/wamuu-jojos-bizarre-adventure-all-star-battle-1.14.jpg"));
			listeCollegue.add(new Collegue("Joline Cujoh",
					"http://statici.behindthevoiceactors.com/behindthevoiceactors/_img/chars/jolyne-cujoh-jojos-bizarre-adventure-all-star-battle-3.46.jpg"));

			listeCollegue.forEach(collegueRepository::save);
		}
	}
}
