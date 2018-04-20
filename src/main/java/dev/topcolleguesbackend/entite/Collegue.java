/**
 * 
 */
package dev.topcolleguesbackend.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "ID")
	private int id;
	/**nom : String*/
	@Column(name = "NOM", nullable = false, unique = true)
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
	 */
	public Collegue(String nom, String photo) {
		super();
		this.nom = nom;
		this.score = 0;
		this.photo = photo;
	}

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param photo
	 * @param email
	 * @param adresse
	 */
	public Collegue(String nom, String photo, String email, String pays) {
		super();
		this.nom = nom;
		this.score = 0;
		this.photo = photo;
		this.email = email;
		this.pays = pays;
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
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
