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
			collegue.setScore(collegue.getScore() + 1);
		} else {
			collegue.setScore(collegue.getScore() - 1);
		}
		return collegue;
	}

}
