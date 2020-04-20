package org.sid.dao;

import org.sid.entities.Context;
import org.sid.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface ContratRepository extends JpaRepository<Contrat, Long> {
}
