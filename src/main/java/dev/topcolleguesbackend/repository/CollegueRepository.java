/**
 * 
 */
package dev.topcolleguesbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.topcolleguesbackend.entite.Collegue;

/**
 * @author Alexis Darcy
 *
 */
public interface CollegueRepository extends JpaRepository<Collegue, Integer> {

	Collegue findByPseudo(String pseudo);

	Boolean existsByPseudo(String pseudo);

	List<Collegue> findTop4ByOrderByScoreAsc();

	List<Collegue> findTop4ByOrderByScoreDesc();

}