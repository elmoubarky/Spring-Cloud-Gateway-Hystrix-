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
public class Clause implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "titre_clause")
    private String titre_clause;
    @Column(name = "e_tab_texte")
    private String e_tab_texte;
    //ajouter texte
    @OneToMany(mappedBy = "clause")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Texte> textes;
    //private Texte texte;
    //ajout clause_contrat
    @ManyToOne
    private Clause_contrat clause_contrat;
}
