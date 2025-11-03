package com.detersak.catalogservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_Vehicle")
public class Vehicle {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Model")
    private String model;

    @Column(name = "Year")
    private Integer year;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "catalog_id")
    private Catalog catalog;

    @Column(name = "catalog_id", insertable = false, updatable = false)
    private Long catalogId;

}
