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
public class Localisations implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "numero")
    private String numero;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "localisation")
    private String localisation;
    @Column(name = "code_postal")
    private String code_postal;
    @Column(name = "surface")
    private String surface;
    //ajouter specifique_climat
    @ManyToOne
    private Specifique_climat specifique_climat;
}
