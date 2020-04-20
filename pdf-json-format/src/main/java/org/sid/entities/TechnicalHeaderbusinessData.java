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
public class TechnicalHeaderbusinessData implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "letter_code")
    private String letter_code;
    @Column(name = "letter_object_number")
    private String letter_object_number;
    @Column(name = "flow_generation_date")
    private String flow_generation_date;
    @Column(name = "benefit_center_name")
    private String benefit_center_name;
    @Column(name = "benefit_center_code")
    private String benefit_center_code;
    @Column(name = "administration_center_code")
    private String administration_center_code;
    @Column(name = "region_unit")
    private String region_unit;
    @Column(name = "source_process_name")
    private String source_process_name;
    @Column(name = "date_traitement_og")
    private String date_traitement_og;
    //ajout de fluxGrelle
    @ManyToOne
    private FluxGrele fluxGrele;
}
