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
public class Contrat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "code_csp")
    private String code_csp;
    @Column(name = "code_detail_csp")
    private String code_detail_csp;
    @Column(name = "libelle_csp")
    private String libelle_csp;
    @Column(name = "commune_exploitation")
    private String commune_exploitation;
    @Column(name = "code_postal_exploitation")
    private String code_postal_exploitation;
    @Column(name = "sau_exploitation")
    private String sau_exploitation;
    @Column(name = "num_pacage")
    private String num_pacage;
    @Column(name = "formule_garantie")
    private String formule_garantie;
    @Column(name = "annee_recolte")
    private String annee_recolte;
    @Column(name = "montant_cotisation_HT")
    private String montant_cotisation_HT;
    @Column(name = "montant_cotisation_TTC")
    private String montant_cotisation_TTC;
    @Column(name = "montant_cotisation_niveau_1")
    private String montant_cotisation_niveau_1;
    @Column(name = "montant_cotisation_niveau_2")
    private String montant_cotisation_niveau_2;
    @Column(name = "montant_subvention")
    private String montant_subvention;
    @Column(name = "date_echeance_annuelle")
    private String date_echeance_annuelle;
    //ajout de businessData
    @ManyToOne
    private BusinessData businessData;
    //ajouter specufuque climat
    @OneToMany(mappedBy = "contrat")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Specifique_climat> specifique_climats;
  //  private Specifique_climat specifique_climat;
}
