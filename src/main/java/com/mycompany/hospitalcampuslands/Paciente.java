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

    public Paciente(String nombre, String descripcion, int id, String telefono, String estado) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.estado = estado;
    }

   public double tipoPaciente() {

        if (edad >= 18) {
            
        } 
        else {
            System.out.println("el paciente es menor" + edad);
        }
        return 0;
        
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

}

//p1.jet estado