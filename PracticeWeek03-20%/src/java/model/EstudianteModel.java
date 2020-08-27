/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author J Cardoza
 */
public class EstudianteModel {

    public Estudiante Consultar() {
        Estudiante estudiante = new Estudiante(1, "Manuel de Jesus", "Cardoza Cardoza", "Ing en Sistemas y computacion", 21);
        return estudiante;
    }

    public void Registrar(Estudiante estudiante) {

    }

    public void Actualizar(Estudiante estudiante) {

    }

    public void Eliminar(int id) {

    }

    public List<Estudiante> listado() {
        List<Estudiante> lista = new ArrayList<>();
        return lista;
    }

}
