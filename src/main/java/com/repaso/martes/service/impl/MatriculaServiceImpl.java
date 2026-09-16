package com.repaso.martes.service.impl;

import com.repaso.martes.models.Matricula;
import com.repaso.martes.repositories.MatriculasRepository;
import com.repaso.martes.service.MatriculasService;

import java.util.List;

public class MatriculaServiceImpl implements MatriculasService {

    private final MatriculasRepository matriculasRepository;
    private final List<Matricula> matriculas;

    public MatriculaServiceImpl(MatriculasRepository matriculasRepository, List<Matricula> matriculas) {
        this.matriculasRepository = matriculasRepository;
        this.matriculas = matriculas;
    }

    @Override
    public List<Matricula> findAll() {
        return matriculasRepository.findAll();
    }

    @Override
    public void save(Matricula matricula) {
        matriculasRepository.save(matricula);
    }

    @Override
    public Matricula findById(Long id) {
        for(Matricula matricula : matriculas){
            if (matricula.getId().equals(id)){
                return matricula;
            }
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        Matricula matricula = findById(id);
        if (matricula != null){
            matriculas.remove(matricula);
        }
    }
}
