package org.sid.dao;

import org.sid.entities.Souscripteur;
import org.sid.entities.Specifique_climat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface SpecifiqueClimatRepository extends JpaRepository<Specifique_climat, Long> {
}
