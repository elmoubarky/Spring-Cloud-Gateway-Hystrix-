package org.sid.dao;

import org.sid.entities.Document;
import org.sid.entities.Emetteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface EmetteurRepository extends JpaRepository<Emetteur, Long> {
}
