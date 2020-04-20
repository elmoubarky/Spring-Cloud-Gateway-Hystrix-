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
public class Emetteur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom_agence")
    private String nom_agence;
    @Column(name = "adresse_no_niv_type_voie")
    private String adresse_no_niv_type_voie;
    @Column(name = "e_tab_clause_contrat")
    private String e_tab_clause_contrat;
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
    @Column(name = "fax")
    private String fax;
    @Column(name = "email")
    private String email;
    //ajout de correspondance
    @ManyToOne
    private Correspondance correspondance;
}
