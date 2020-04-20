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
public class Natures implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "num_natures_recolte")
    private String num_natures_recolte;
    @Column(name = "libelle_natures_recolte")
    private String libelle_natures_recolte;
    @Column(name = "surface_assuree")
    private String surface_assuree;
    @Column(name = "rendement_assuree")
    private String rendement_assuree;
    @Column(name = "complement_rendement")
    private String complement_rendement;
    @Column(name = "prix_assure")
    private String prix_assure;
    @Column(name = "prix_assure_CNGRA")
    private String prix_assure_CNGRA;
    @Column(name = "complement_prix")
    private String complement_prix;
    @Column(name = "capital_assure")
    private String capital_assure;
    @Column(name = "capital_subventionnable")
    private String capital_subventionnable;
    @Column(name = "capital_subventionnable_niveau_1")
    private String capital_subventionnable_niveau_1;
    @Column(name = "capital_subventionnable_niveau_2")
    private String capital_subventionnable_niveau_2;
    @Column(name = "libelle_convention_speciale")
    private String libelle_convention_speciale;
    //ajouter specifique_climat
    @ManyToOne
    private Specifique_climat specifique_climat;
    //ajouter rendement
    @OneToMany(mappedBy = "natures")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Rendement> rendements;
    //private Rendement rendement;
    //ajouter garanties_climat
    @OneToMany(mappedBy = "natures")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Garanties_climat> garanties_climats;
   // private Garanties_climat garanties_climat;
    //ajouter renvoi
   @OneToMany(mappedBy = "natures")
   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
   private Collection<Renvoi> renvois;
   // private  Renvoi renvoi;
}
