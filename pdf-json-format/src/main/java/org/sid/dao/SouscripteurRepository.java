package org.sid.dao;

import org.sid.entities.Rendement;
import org.sid.entities.Souscripteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface SouscripteurRepository extends JpaRepository<Souscripteur, Long> {
}
