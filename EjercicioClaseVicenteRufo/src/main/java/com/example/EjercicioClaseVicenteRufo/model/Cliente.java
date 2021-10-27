package com.example.EjercicioClaseVicenteRufo.model;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @Builder
public abstract class Cliente implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private String direccion;

    //Se elige una asociacion bidireccional
    @OneToMany(mappedBy = "cliente")
    private List<Pedidos> pedidos;
}
