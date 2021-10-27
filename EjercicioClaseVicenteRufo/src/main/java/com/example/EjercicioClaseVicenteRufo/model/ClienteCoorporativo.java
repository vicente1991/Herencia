package com.example.EjercicioClaseVicenteRufo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.ArrayList;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ClienteCoorporativo extends Cliente{

    private double ingresos;

    //Se elige una asociacion bidireccional
    @ManyToOne
    private Empleado empleado;


    //Helpers


    public void addEmpleado(Empleado e){
        empleado = e;
        if(e.getClientesCoorporativos()==null){
            e.setClientesCoorporativos(new ArrayList<>());
            e.getClientesCoorporativos().add(this);
        }
    }
    public void removeEmpleado(Empleado e){
        empleado = null;
        e.getClientesCoorporativos().remove(this);
    }
}
