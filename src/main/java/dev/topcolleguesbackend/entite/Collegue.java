/**
 * 
 */
package dev.topcolleguesbackend.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Alexis Darcy
 *
 */
@Entity
@Table(name = "COLLEGUE")
public class Collegue {

	/** id : int */
	@Id
	@JsonIgnore
	@Column(name = "MATRICULE", nullable = false, unique = true)
	private String matricule;
	/** pseudo : String */
	@Column(name = "PSEUDO", nullable = false, unique = true)
	private String pseudo;
	/** prenom : String */
	@Column(name = "PRENOM", nullable = false)
	private String prenom;
	/**nom : String*/
	@Column(name = "NOM", nullable = false)
	private String nom;
	/** score : Integer */
	@Column(name = "SCORE", nullable = false)
	private Integer score;
	/** photo : String */
	@Column(name = "PHOTO", nullable = false)
	private String photo;
	/** score : Integer */
	@Column(name = "EMAIL", nullable = false)
	private String email;
	/** photo : String */
	@Column(name = "PAYS", nullable = false)
	private String pays;

	/**
	 * Constructeur
	 * 
	 */
	public Collegue() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param photo
	 * @param email
	 * @param adresse
	 */
	public Collegue(String matricule, String pseudo, String prenom, String nom, String photo, String email,
			String pays) {
		super();
		this.matricule = matricule;
		this.pseudo = pseudo;
		this.prenom = prenom;
		this.nom = nom;
		this.score = 0;
		this.photo = photo;
		this.email = email;
		this.pays = pays;
	}

	/**
	 * Getter
	 * 
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * Setter
	 * 
	 * @param matricule
	 *            the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/**
	 * Getter
	 * 
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * Setter
	 * 
	 * @param pseudo
	 *            the pseudo to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	/**
	 * Getter
	 * 
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter
	 * 
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the score
	 */
	public Integer getScore() {
		return score;
	}

	/**
	 * Setter
	 * 
	 * @param score
	 *            the score to set
	 */
	public void setScore(Integer score) {
		this.score = score;
	}

	/**
	 * Getter
	 * 
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * Setter
	 * 
	 * @param photo
	 *            the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * Getter
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter
	 * 
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Getter
	 * 
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}

	/**
	 * Setter
	 * 
	 * @param pays
	 *            the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}

}
