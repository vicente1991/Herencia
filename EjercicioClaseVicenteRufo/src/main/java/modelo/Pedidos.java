package modelo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;

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
}
