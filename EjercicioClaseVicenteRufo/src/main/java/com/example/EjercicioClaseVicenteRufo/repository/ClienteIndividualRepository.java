package com.example.EjercicioClaseVicenteRufo.repository;

import com.example.EjercicioClaseVicenteRufo.model.ClienteIndividual;
import com.example.EjercicioClaseVicenteRufo.service.ClienteIndividualService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteIndividualRepository extends JpaRepository<ClienteIndividual,Long> {
}
