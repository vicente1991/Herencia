package com.example.EjercicioClaseVicenteRufo.repository;

import com.example.EjercicioClaseVicenteRufo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

    @Query("select c from Cliente c where TYPE(c) = ClienteCorporativo")
    public List<Cliente> clientesCorporativo();

    @Query("select c from Cliente c where TYPE(c) = ClienteParticular")
    public List<Cliente> clientesParticulares();
}
