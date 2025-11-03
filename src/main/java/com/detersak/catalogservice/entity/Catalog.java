package com.detersak.catalogservice.entity;

import com.detersak.catalogservice.enums.PriceRange;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_Catalog")
public class Catalog {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Price")
    PriceRange priceRange;
    @JsonIgnore
    @OneToMany(mappedBy = "catalog", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vehicle> vehicles;

}
