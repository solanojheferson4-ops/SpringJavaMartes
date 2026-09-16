package com.repaso.martes.repositories.Impl;

import com.repaso.martes.models.Matricula;
import com.repaso.martes.repositories.MatriculasRepository;

import java.util.List;

public class MatriculaRepositoryImpl implements MatriculasRepository {

    private final List<Matricula> matriculas;

    public MatriculaRepositoryImpl(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    @Override
    public void save(Matricula matricula) {
        this.matriculas.add(matricula);
    }

    @Override
    public Matricula findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Matricula matricula) {

    }

    @Override
    public List<Matricula> findAll() {
        return List.of();
    }
}
