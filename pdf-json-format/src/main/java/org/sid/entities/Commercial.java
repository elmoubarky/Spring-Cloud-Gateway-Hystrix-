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
public class Commercial implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "civ_nom_prenom")
    private String civ_nom_prenom;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "email")
    private String email;
    //ajout de correspondance
    @ManyToOne
    private Correspondance correspondance;
}
