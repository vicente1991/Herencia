package com.example.EjercicioClaseVicenteRufo.service;

import com.example.EjercicioClaseVicenteRufo.model.Pedidos;
import com.example.EjercicioClaseVicenteRufo.repository.PedidosRepository;
import com.example.EjercicioClaseVicenteRufo.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PedidosService extends BaseService<Pedidos,Long, PedidosRepository> {
}
