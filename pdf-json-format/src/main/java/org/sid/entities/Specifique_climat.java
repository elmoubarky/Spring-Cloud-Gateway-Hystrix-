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
public class Specifique_climat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //ajouter contrat
    @ManyToOne
    private Contrat contrat;
    //ajouter natures
    //ajouter specifique climat
    @OneToMany(mappedBy = "specifique_climat")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Natures> natures;
    //private Natures natures;
    //ajouter surfaces
    @OneToMany(mappedBy = "specifique_climat")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Surfaces> surfaces;
    //private Surfaces surfaces;
    //ajouter localisations
    @OneToMany(mappedBy = "specifique_climat")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Localisations> localisations;
   // private Localisations localisations;
}
