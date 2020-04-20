package org.sid.dao;

import org.sid.entities.References;
import org.sid.entities.Rendement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface RendementRepository extends JpaRepository<Rendement, Long> {
}
