/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospitalcampuslands;

import java.util.Scanner;
/**
 *
 * @author STIVEN MARTINEZ VILLAMIZAR
 */
public class FuncionesPaciente {

   
    static Paciente registro_paciente(String nombre, String id, int edad, String descripcion, String telefono) {
        return new Paciente(nombre, id, edad, descripcion, telefono);
    }

    public static void menu(Paciente p1, Paciente p2, Paciente p3, Paciente p4) {

        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("""
            *************************
                  BIENVENIDO
            *************************
            1. Registrar paciente
            2. Mostrar pacientes registrados
            3. Atender paciente
            4. Salir
            """);

            op = sc.nextInt();
            sc.nextLine(); 

            while (op < 1 || op > 4) {
                System.out.println("Opción inválida");
                op = sc.nextInt();
                sc.nextLine();
            }

            switch (op) {

                case 1 -> {
                    System.out.println("Ingrese el nombre completo:");
                    String nombre = sc.nextLine();

                    System.out.println("Ingrese el número de documento:");
                    String id = sc.nextLine();

                    System.out.println("Ingrese la edad:");
                    int edad = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el motivo de la consulta:");
                    String descripcion = sc.nextLine();

                    System.out.println("Ingrese los teléfonos:");
                    String telefono = sc.nextLine();

                    if (p1 == null) {
                        p1 = registro_paciente(nombre, id, edad, descripcion, telefono);
                    } else if (p2 == null) {
                        p2 = registro_paciente(nombre, id, edad, descripcion, telefono);
                    } else if (p3 == null) {
                        p3 = registro_paciente(nombre, id, edad, descripcion, telefono);
                    } else if (p4 == null) {
                        p4 = registro_paciente(nombre, id, edad, descripcion, telefono);
                    } else {
                        System.out.println("El cupo máximo de pacientes se ha alcanzado.");
                    }
                }

                case 2 -> {
                    
                    System.out.println("Mostrar pacientes (pendiente)");
                    
                }

                case 3 -> {
                    System.out.println("Atender paciente (pendiente)");
                }
            }

        } while (op != 4);

        System.out.println("Programa finalizado.");
    }
}
