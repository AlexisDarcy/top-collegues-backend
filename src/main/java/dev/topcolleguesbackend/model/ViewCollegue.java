/**
 * 
 */
package dev.topcolleguesbackend.model;

/**
 * @author Alexis Darcy
 *
 */
public class ViewCollegue {

	/** matricule : String */
	private String matricule;
	/** pseudo : String */
	private String pseudo;
	/** url : String */
	private String url;

	/**
	 * Constructeur
	 * 
	 */
	public ViewCollegue() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param matricule
	 * @param pseudo
	 * @param url
	 */
	public ViewCollegue(String matricule, String pseudo, String url) {
		super();
		this.matricule = matricule;
		this.pseudo = pseudo;
		this.url = url;
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
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Setter
	 * 
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
}
