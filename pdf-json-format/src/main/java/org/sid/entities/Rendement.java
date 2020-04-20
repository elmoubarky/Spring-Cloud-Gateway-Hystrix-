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
public class Rendement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "unite_rendement")
    private String unite_rendement;
    @Column(name = "annee1")
    private String annee1;
    @Column(name = "annee2")
    private String annee2;
    @Column(name = "annee3")
    private String annee3;
    @Column(name = "annee4")
    private String annee4;
    @Column(name = "annee5")
    private String annee5;
    @Column(name = "valeur1")
    private String valeur1;
    @Column(name = "renvoitableau1")
    private String renvoitableau1;
    @Column(name = "valeur2")
    private String valeur2;
    @Column(name = "renvoitableau2")
    private String renvoitableau2;
    @Column(name = "valeur3")
    private String valeur3;
    @Column(name = "renvoitableau3")
    private String renvoitableau3;
    @Column(name = "valeur4")
    private String valeur4;
    @Column(name = "renvoitableau4")
    private String renvoitableau4;
    @Column(name = "valeur5")
    private String valeur5;
    @Column(name = "renvoitableau5")
    private String renvoitableau5;
    @Column(name = "rendement_historique")
    private String rendement_historique;
    //ajout de  natures
    @ManyToOne
    private Natures natures;
    //ajouter renvoi
    @OneToMany(mappedBy = "rendement")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Renvoi> renvois;
    //private Renvoi renvoi;

}
