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
public class Details implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "libelle")
    private String libelle;
    @Column(name = "indicateur")
    private String indicateur;
    @Column(name = "seuil")
    private String seuil;
    @Column(name = "franchise")
    private String franchise;
    @Column(name = "limite")
    private String limite;
    //ajout de garanties_climat
    @ManyToOne
    private Garanties_climat garanties_climat;
}
