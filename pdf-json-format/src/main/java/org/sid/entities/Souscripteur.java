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
public class Souscripteur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom_raison_sociale")
    private String nom_raison_sociale;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "adresse_bat_esc_bloc_res")
    private String adresse_bat_esc_bloc_res;
    @Column(name = "adresse_no_niv_type_voie")
    private String adresse_no_niv_type_voie;
    @Column(name = "adresse_complement")
    private String adresse_complement;
    @Column(name = "adresse_lieu_dit")
    private String adresse_lieu_dit;
    @Column(name = "adresse_code_postal")
    private String adresse_code_postal;
    @Column(name = "adresse_ville")
    private String adresse_ville;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "email")
    private String email;
    //ajout de correspondance
    @ManyToOne
    private Correspondance correspondance;
}
