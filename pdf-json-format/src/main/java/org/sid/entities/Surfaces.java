package org.sid.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Surfaces implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "numero")
    private String numero;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "surface")
    private String surface;
    @Column(name = "rendement")
    private String rendement;
    @Column(name = "prix_assure")
    private String prix_assure;
    @Column(name = "cotisation_subventionnable_niveau_1")
    private String cotisation_subventionnable_niveau_1;
    @Column(name = "cotisation_subventionnable_niveau_2")
    private String cotisation_subventionnable_niveau_2;
    @Column(name = "cotisation_non_subventionnable")
    private String cotisation_non_subventionnable;
    @Column(name = "cotisation_subventionnable_totale")
    private String cotisation_subventionnable_totale;
    //ajouter specifique_climat
    @ManyToOne
    private Specifique_climat specifique_climat;
}
