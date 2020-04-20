package org.sid.dao;

import org.sid.entities.TechnicalHeaderbusinessData;
import org.sid.entities.Texte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface TextesRepository extends JpaRepository<Texte, Long> {
}
