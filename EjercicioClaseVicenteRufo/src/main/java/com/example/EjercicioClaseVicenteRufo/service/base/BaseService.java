package com.example.EjercicioClaseVicenteRufo.service.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public class BaseService<T,ID, R extends JpaRepository<T,ID>> {

    @Autowired
    protected R repositorio;

    public void save(T t){
        repositorio.save(t);
    }
    public void delete(T t){
        repositorio.delete(t);
    }
    public void deleteById(ID id){
        repositorio.deleteById(id);
    }
    public List<T> findAll(){
        return repositorio.findAll();
    }
    public Optional<T> findById(ID id){
        return repositorio.findById(id);
    }
    public void edit(T t){
        repositorio.save(t);
    }
}
