package com.example.EjercicioClaseVicenteRufo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.ArrayList;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@DiscriminatorValue("CC")
public class ClienteCoorporativo extends Cliente{

    private String nombreEmpresa;

    //Se elige una asociacion bidireccional
    @ManyToOne
    private Empleado empleado;


    //Helpers


    public void addEmpleado(Empleado e){
        empleado = e;
        e.getClientes().add(this);
    }
    public void removeEmpleado(Empleado e){
        e.getClientes().remove(this);
        empleado = null;
    }
}
