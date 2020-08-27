/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author J Cardoza
 */
public class Estudiante {

    private int id;
    private String nombre;
    private String apellido;
    private String carrera;
    private int edad;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String carrera, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.edad = edad;
    }

    public Estudiante(int id, String nombre, String apellido, String carrera, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
