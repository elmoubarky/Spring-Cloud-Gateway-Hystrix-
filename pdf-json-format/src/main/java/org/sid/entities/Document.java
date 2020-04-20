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
public class Document implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "titre")
    private String titre;
    @Column(name = "date_document")
    private String date_document;
    @Column(name = "ville_document")
    private String ville_document;
    @Column(name = "date_validite_document")
    private String date_validite_document;
    @Column(name = "identifiant_devis")
    private String identifiant_devis;
    @Column(name = "identifiant_document")
    private String identifiant_document;
    @Column(name = "libelle_produit")
    private String libelle_produit;
    @Column(name = "date_debut_effet")
    private String date_debut_effet;
    @Column(name = "date_echeance")
    private String date_echeance;
    @Column(name = "nature_mouvement")
    private String nature_mouvement;
    @Column(name = "code_barre")
    private String code_barre;
    @Column(name = "code_barre_signature")
    private String code_barre_signature;
    @Column(name = "numero_proposant")
    private String numero_proposant;
    @Column(name = "complement_signature")
    private String complement_signature;
    @Column(name = "nom_client")
    private String nom_client;
    @Column(name = "nom_agence")
    private String nom_agence;
    @Column(name = "code_modele_CG")
    private String code_modele_CG;
    //ajout de common
    @ManyToOne
    private Common common;
}


