package com.example.EjercicioClaseVicenteRufo.repository;

import com.example.EjercicioClaseVicenteRufo.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado,Long> {
}
