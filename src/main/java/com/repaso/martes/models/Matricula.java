package com.repaso.martes.models;

public class Matricula {
    private String matriculasName;
    private String matriculasCode;
    public Matricula(String matriculasName, String matriculasCode, String matriculaStatus) {
        this.matriculasName = matriculasName;
        this.matriculasCode = matriculasCode;
        this.matriculaStatus = matriculaStatus;
    }

    private String matriculaStatus;

    public String getCourseName() {
        return matriculasName;
    }

    public String getMatriculasCode() {
        return matriculasCode;
    }

    public String getMatriculaStatus() {
        return matriculaStatus;
    }

    public void setCourseName(String courseName) {
        this.matriculasName = courseName;
    }

    public void setMatriculasCode(String matriculasCode) {
        this.matriculasCode = matriculasCode;
    }

    public void setMatriculaStatus(String matriculaStatus) {
        this.matriculaStatus = matriculaStatus;
    }

    public void add(Matricula matricula) {
        matricula.add(matricula);
    }

    public Object getId() {
        return null;
    }
}