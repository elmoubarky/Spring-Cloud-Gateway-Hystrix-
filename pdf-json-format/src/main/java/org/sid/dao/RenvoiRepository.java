package org.sid.dao;

import org.sid.entities.Rendement;
import org.sid.entities.Renvoi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface RenvoiRepository extends JpaRepository<Renvoi, Long> {
}
