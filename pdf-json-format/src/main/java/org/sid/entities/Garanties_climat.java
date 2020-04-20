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
public class Garanties_climat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "titre")
    private String titre;
    //ajout de  natures
    @ManyToOne
    private Natures natures;
    //ajouter details
    @OneToMany(mappedBy = "garanties_climat")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Details> details;
    //private Details details;
}
