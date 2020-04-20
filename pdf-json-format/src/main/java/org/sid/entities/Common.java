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
public class Common implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "type_doc")
    private String type_doc;
    //ajout de businessData
    @ManyToOne
    private BusinessData businessData;
    //ajouter correspondance
    @OneToMany(mappedBy = "common")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Correspondance> correspondances;
    //private Correspondance correspondance;
    //ajouter document
    @OneToMany(mappedBy = "common")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Document> documents;
    //private Document document;
}


