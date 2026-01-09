/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalcampuslands;


public class Paciente {

    String nombre;
    String id;
    int edad;
    String descripcion;
    String telefono;
    String tipoPaciente;
    String estado;

 public Paciente(String nombre, int edad, String descripcion, String id, String telefono, String estado) {
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

    public String getId() {
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

    public void setEstado(String estado) {
    this.estado = estado;
}
public void historialsito() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Documento: " + id);
    System.out.println("Edad: " + edad);
    System.out.println("Tipo: " + tipoPaciente);
    System.out.println("Estado: " + estado);
    System.out.println("Motivo: " + descripcion);
    System.out.println("Telefonos: " + telefono);
}


}