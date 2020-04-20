package org.sid.dao;

import org.sid.entities.FluxGrele;
import org.sid.entities.Natures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface NaturesRepository extends JpaRepository<Natures, Long> {
}
