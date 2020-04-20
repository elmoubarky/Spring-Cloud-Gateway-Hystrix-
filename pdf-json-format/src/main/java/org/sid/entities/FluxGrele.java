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
public class FluxGrele implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    //ajouter  de la liste de contexte
    @OneToMany(mappedBy = "fluxGrele")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Context> contexts;
    //ajouter technicalHeaderbusinessData
    @OneToMany(mappedBy = "fluxGrele")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<TechnicalHeaderbusinessData> technicalHeaderbusinessData;
   // private TechnicalHeaderbusinessData technicalHeaderbusinessData;
    //ajouter businessData
   @OneToMany(mappedBy = "fluxGrele")
   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
   private Collection<BusinessData> businessData;
    //private BusinessData businessData;
}
