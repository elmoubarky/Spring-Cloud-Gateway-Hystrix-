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
public class BusinessData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "e_tab_clause_contrat")
    private String e_tab_clause_contrat;
    //ajouter  common
    @OneToMany(mappedBy = "businessData")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Common> commons;
    //private Common common;
    //ajouter clause_contrat
    @OneToMany(mappedBy = "businessData")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Clause_contrat> clause_contrats;
    //private Clause_contrat clause_contrat;
    //ajouter contrat
    @OneToMany(mappedBy = "businessData")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Contrat> contrats;
    //private Contrat contrat;
    //ajout de fluxGrelle
    @ManyToOne
    private FluxGrele fluxGrele;

}
