package com.example.EjercicioClaseVicenteRufo.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @SuperBuilder
public class Pedidos  implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;


    public void addCliente(Cliente c){
        cliente = c;
        if (c.getPedidos()==null){
            c.setPedidos(new ArrayList<>());
            c.getPedidos().add(this);
        }
    }
    public void removeCliente(Cliente c){
        cliente = null;
        c.getPedidos().remove(this);
    }
}
