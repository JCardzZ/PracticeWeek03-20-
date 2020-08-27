/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Estudiante;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import model.EstudianteModel;

/**
 *
 * @author J Cardoza
 */
@Named(value = "estudianteManagedBean")
@SessionScoped
public class EstudianteManagedBean implements Serializable {

    /**
     * Creates a new instance of EstudianteManagedBean
     */
    private EstudianteModel estudianteModel = new EstudianteModel();
    private Estudiante estudiante = new Estudiante();

    private List<Estudiante> listado = new ArrayList<>();

    public List<Estudiante> getListado() {
        return listado;
    }

    public String agregar() {
        listado.add(this.getEstudiante());
        this.setEstudiante(new Estudiante());
        return "index?faces-redirect=true";

    }

    public EstudianteManagedBean() {
    }

    public Estudiante getEstudianteModel() {
        return estudianteModel.Consultar();
    }

    /**
     * @return the estudiante
     */
    public Estudiante getEstudiante() {
        return estudiante;
    }

    /**
     * @param estudiante the estudiante to set
     */
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

}
