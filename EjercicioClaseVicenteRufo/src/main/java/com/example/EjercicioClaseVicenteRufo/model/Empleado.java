package com.example.EjercicioClaseVicenteRufo.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Empleado implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private String apellidos;

    private String nombreEmpresa;

    private String residencia;

    //Se elige una asociacion bidireccional
    @OneToMany(mappedBy = "empleado")
    private List<ClienteCoorporativo> clientesCoorporativos;
}
