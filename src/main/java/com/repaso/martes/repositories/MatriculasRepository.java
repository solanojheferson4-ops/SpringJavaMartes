package com.repaso.martes.repositories;

import com.repaso.martes.models.Matricula;

import java.util.List;

public interface MatriculasRepository {
    void save(Matricula matricula);
    Matricula findById(Long id);
    void  deleteById(Matricula matricula);
    List<Matricula> findAll();
}
