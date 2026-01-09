/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalcampuslands;


/**
 *
 * @author STIVEN MARTINEZ VILLAMIZAR
 */
public class Paciente {

    String nombre;
    int id;
    int edad;
    String descripcion;
    String telefono;
    String tipoPaciente;
    String estado;

 public Paciente(String nombre, int edad, String descripcion, int id1, String telefono, String estado) {
    this.nombre = nombre;
    this.edad = edad;
    this.id = id;
    this.descripcion = descripcion;
    this.telefono = telefono;
    this.estado = estado;
}


public String tipoPaciente() {
    if (edad >= 18) {
        tipoPaciente = "Adulto";
    } else {
        tipoPaciente = "Menor";
    }
    return tipoPaciente;
}


    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public String getEstado() {
        return estado;
    }

    boolean getnombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}