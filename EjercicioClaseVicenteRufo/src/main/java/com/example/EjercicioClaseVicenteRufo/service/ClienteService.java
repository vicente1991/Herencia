package com.example.EjercicioClaseVicenteRufo.service;


import com.example.EjercicioClaseVicenteRufo.model.Cliente;
import com.example.EjercicioClaseVicenteRufo.repository.ClienteRepository;
import com.example.EjercicioClaseVicenteRufo.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ClienteService extends BaseService<Cliente,Long, ClienteRepository> {
}
