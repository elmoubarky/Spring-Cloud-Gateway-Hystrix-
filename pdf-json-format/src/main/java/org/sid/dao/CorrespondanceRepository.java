package org.sid.dao;

import org.sid.entities.Contrat;
import org.sid.entities.Correspondance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface CorrespondanceRepository extends JpaRepository<Correspondance, Long> {
}
