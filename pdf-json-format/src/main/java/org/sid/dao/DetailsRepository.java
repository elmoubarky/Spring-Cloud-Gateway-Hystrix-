package org.sid.dao;

import org.sid.entities.Correspondance;
import org.sid.entities.Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface DetailsRepository extends JpaRepository<Details, Long> {
}
