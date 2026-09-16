package com.repaso.martes.service;

import com.repaso.martes.models.Matricula;

import java.util.List;

public interface MatriculasService {
    List<Matricula> findAll();
    void save(Matricula matricula);
    Matricula findById(Long id);
    void deleteById(Long id);
}