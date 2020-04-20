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
public class Correspondance implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //ajout de common
    @ManyToOne
    private Common common;
    //ajouter emmeteur
    @OneToMany(mappedBy = "correspondance")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Emetteur> emetteurs;
    //private Emetteur emetteur;
    //ajouter references
    @OneToMany(mappedBy = "correspondance")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<References> references;
    //private References references;
    //souscripteur
    @OneToMany(mappedBy = "correspondance")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Souscripteur> souscripteurs;
    //private Souscripteur souscripteur;
    //commercial
    @OneToMany(mappedBy = "correspondance")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Commercial> commercials;
    //private Commercial commercial;
}
