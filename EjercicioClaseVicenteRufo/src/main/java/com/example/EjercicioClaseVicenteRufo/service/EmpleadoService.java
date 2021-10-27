package com.example.EjercicioClaseVicenteRufo.service;


import com.example.EjercicioClaseVicenteRufo.model.Empleado;
import com.example.EjercicioClaseVicenteRufo.repository.EmpleadoRepository;
import com.example.EjercicioClaseVicenteRufo.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoService extends BaseService<Empleado,Long, EmpleadoRepository> {
}
