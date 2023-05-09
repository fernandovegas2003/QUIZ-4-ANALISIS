/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.view.administradorlistatareas;

import java.util.Scanner;

/**
 *
 * @author julic
 */
public class ConsoleView {
   private Scanner scanner = new Scanner(System.in);
   
    public String leerTitulo() {
      System.out.print("Título: ");
      return scanner.nextLine();
    }

    public String leerDescripcion() {
      System.out.print("Descripción: ");
      return scanner.nextLine();
    }
    
    public String leerEstado() {
      System.out.print("Descripción: ");
      return scanner.nextLine();
    }

    public void mostrarMenu() {
      System.out.println("------- LISTA DE TAREAS -------");
      System.out.println("1. Ver tareas");
      System.out.println("2. Agregar tarea");
      System.out.println("3. Actualizar tarea");
      System.out.println("4. Eliminar tarea");
      System.out.println("5. Salir");
    }

    public int leerOpcion() {
      System.out.print("Ingrese una opción: ");
      return scanner.nextInt();
    }

    public void mostrarTarea(String titulo, String descripcion, boolean completada) {
      String estado = completada ? "Completada" : "Pendiente";
      System.out.println("Título: " + titulo);
      System.out.println("Descripción: " + descripcion);
      System.out.println("Estado: " + estado);
    }

    public void mostrarMensaje(String mensaje) {
      System.out.println(mensaje);
    }

    public Object getMensaje() {
        Object mensaje = null;
        return mensaje;
    }

    public void agregarOpcion(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void agregarEntrada(String hacer_la_tarea_de_matemáticas_antes_del_s) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
