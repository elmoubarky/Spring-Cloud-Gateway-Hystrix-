package org.sid.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor @Getter @Setter @AllArgsConstructor
public class Context implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "codeMaquette")
    private String codeMaquette;
    @Column(name = "centreProfit")
    private String centreProfit;
    @Column(name = "codeApplication")
    private String codeApplication;
    @Column(name = "state")
    private String state;
    @Column(name = "benefitCenter")
    private String benefitCenter;
    @Column(name = "identifiantUnique")
    private String identifiantUnique;
    @Column(name = "uriNameSpaceRootElement")
    private String uriNameSpaceRootElement;
    //ajout de fluxGrele
    @ManyToOne
    private FluxGrele fluxGrele;
}
