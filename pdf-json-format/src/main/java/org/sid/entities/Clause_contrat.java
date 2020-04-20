package org.sid.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Clause_contrat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "libelle_clause")
    private String libelle_clause;
    //ajout de businessData
    @ManyToOne
    private BusinessData businessData;
    //ajouter clause
    @OneToMany(mappedBy = "clause_contrat")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Clause> clauses;
    //private Clause clause;
}
