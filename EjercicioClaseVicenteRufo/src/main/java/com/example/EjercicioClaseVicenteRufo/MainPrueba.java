package com.example.EjercicioClaseVicenteRufo;

import com.example.EjercicioClaseVicenteRufo.model.*;
import com.example.EjercicioClaseVicenteRufo.repository.ClienteRepository;
import com.example.EjercicioClaseVicenteRufo.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class MainPrueba {

    private final ClienteService clienteService;
    private final ClienteCoorporativoService clienteCoorporativoService;
    private final ClienteIndividualService clienteIndividualService;
    private final PedidosService pedidosService;
    private final EmpleadoService empleadoService;
    private final ClienteRepository clienteRepository;


    @PostConstruct
    public void test(){
        Cliente cliente1 = Cliente.builder()
                .nombre("Alejandro")
                .direccion("Calle tolejos")
                .build();
        clienteService.save(cliente1);
        Cliente cliente2 = Cliente.builder()
                .nombre("Javier")
                .direccion("Calle Mascerca")
                .build();
        clienteService.save(cliente2);

        Pedidos pedido1 = Pedidos.builder()
                .name("tijeras de podar")
                .build();
        pedido1.addCliente(cliente1);
        pedidosService.save(pedido1);

        Pedidos pedido2 = Pedidos.builder()
                .name("maquina de jardin")
                .build();
        pedido2.addCliente(cliente2);
        pedidosService.save(pedido2);

        Empleado empleado1 = Empleado.builder()
                .nombre("Pablo")
                .apellidos("Seguro Velazquez")
                .nombreEmpresa("Google")
                .residencia("Calle Milloneti nº4 3ºC")
                .build();
        empleadoService.save(empleado1);

        Empleado empleado2 = Empleado.builder()
                .nombre("Inmaculada")
                .residencia("Calle Milloneti nº5 2ºA")
                .build();
        empleadoService.save(empleado2);

        ClienteCoorporativo cliCorp1 = (ClienteCoorporativo) ClienteCoorporativo.builder()
                .ingresos(1000000)
                .nombre("Yo mismo")
                .direccion("Montequinto")
                .build();
        cliCorp1.addEmpleado(empleado1);
        clienteCoorporativoService.save(cliCorp1);

        ClienteCoorporativo clipCorp2 = (ClienteCoorporativo) ClienteCoorporativo.builder()
                        .ingresos(10000)
                        .nombre("Yo mismo")
                        .direccion("Montequinto")
                        .build();
        clipCorp2.addEmpleado(empleado2);
        clienteCoorporativoService.save(clipCorp2);

        


        System.out.println("Todos los clientes");
        clienteService.findAll().forEach(c -> {
            System.out.println(c.getNombre());
        });
        System.out.println("Todos los clientes Corporativos");
        clienteRepository.clientesCorporativo().forEach(c -> {
            System.out.println(c.getNombre());
        });
        System.out.println("Todos los clientes Individuales");
        clienteRepository.clientesParticulares().forEach(c -> {
            System.out.println(c.getNombre());
        });

    }
}
