package com.example.EjercicioClaseVicenteRufo.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @SuperBuilder
public class Pedidos  implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @CreatedDate
    private LocalDateTime fechaCreacion;

    @Enumerated(EnumType.STRING)
    private EstadoPedido estadoPedido;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;


    public void addCliente(Cliente c){
        cliente = c;
        c.getPedidos().add(this);
        }
    public void removeCliente(Cliente c){
        c.getPedidos().remove(this);
        cliente = null;
    }
}
