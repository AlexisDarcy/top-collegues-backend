/**
 * 
 */
package dev.topcolleguesbackend.service;

import dev.topcolleguesbackend.entite.Collegue;
import dev.topcolleguesbackend.model.Avis;
import dev.topcolleguesbackend.model.VoteActionIhm;

/**
 * @author Alexis Darcy
 *
 */
public class VoteService {

	public static Collegue GestionScore(Collegue collegue, VoteActionIhm action) {
		if (action.getAction().equals(Avis.AIMER)) {
			if (collegue.getScore() < 1000) {
				collegue.setScore(collegue.getScore() + 10);
			}
		} else {
			if (collegue.getScore() > -1000) {
				collegue.setScore(collegue.getScore() - 5);
			}
		}
		return collegue;
	}

}
