package org.sid.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "referencess")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class References implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "num_client")
    private String num_client;
    @Column(name = "num_souscripteur")
    private String num_souscripteur;
    @Column(name = "num_contrat")
    private String num_contrat;
    @Column(name = "num_contrat_remplacant")
    private String num_contrat_remplacant;
    @Column(name = "num_contrat_avenant")
    private String num_contrat_avenant;
    //ajout de correspondance
    @ManyToOne
    private Correspondance correspondance;
}
