/**
 * 
 */
package dev.topcolleguesbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.topcolleguesbackend.entite.Collegue;

/**
 * @author Alexis Darcy
 *
 */
public interface CollegueRepository extends JpaRepository<Collegue, Integer> {
	Collegue findByNom(String nom);

	Boolean existsByNom(String nom);
}