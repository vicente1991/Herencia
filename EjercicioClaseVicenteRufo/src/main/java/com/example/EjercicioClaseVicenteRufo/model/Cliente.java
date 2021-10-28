package com.example.EjercicioClaseVicenteRufo.model;


import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@NamedEntityGraph(
        name = Cliente.CLIENTE_PEDIDO,
        attributeNodes = {
                @NamedAttributeNode("pedidos")
        }

)
@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @SuperBuilder
@DiscriminatorValue("C")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Cliente implements Serializable {

    public static final String CLIENTE_PEDIDO= "grafo cliente-pedido";
    @Id
    @GeneratedValue
    protected Long id;

    protected String nombre;
    protected String email;
    protected String direccion;

    //Se elige una asociacion bidireccional
    @OneToMany(mappedBy = "cliente")
    protected List<Pedidos> pedidos= new ArrayList<>();
}
