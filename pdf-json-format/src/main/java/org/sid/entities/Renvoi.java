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
public class Renvoi implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "num_renvoi")
    private String num_renvoi;
    @Column(name = "libelle_renvoi")
    private String libelle_renvoi;
    //ajout de  natures
    @ManyToOne
    private Natures natures;
    //ajout de  rendement
    @ManyToOne
    private Rendement rendement;
}
