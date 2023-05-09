/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.controller.administradorlistatareas;

import com.todo.model.administradorlistatareas.Task;
import com.todo.view.ConsoleView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julic
 */
public class TaskController {
     private List<Task> tareas = new ArrayList<>();
    private ConsoleView vista = new ConsoleView();
    private final CosoleView view;
  
    public TaskController(ConsoleView view) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  public void agregarTarea(String titulo, String descripcion, String estado) {
    Task tarea = new Task(titulo, descripcion, Boolean.parseBoolean(estado));
    tareas.add(tarea);
    vista.mostrarMensaje("Tarea agregada.");
  }

  public void verTareas() {
  if (tareas.isEmpty()) {
    vista.mostrarMensaje("No hay tareas.");
    return;
  }
  for (Task tarea : tareas) {
    vista.mostrarTarea(tarea.getTitulo(), tarea.getDescripcion(), tarea.getEstado());
  }
}

  public void actualizarTarea(int par, String nuevoTitulo, String nuevaDescripcion, boolean nuevoEstado, Object par4) {
    int indice = leerIndiceTarea();
    Task tarea = tareas.get(indice);
    vista.mostrarTarea(tarea.getTitulo(), tarea.getDescripcion(), tarea.getEstado());
    vista.mostrarMensaje("Ingrese el nuevo título y la nueva descripción:");
    String titulo = vista.leerTitulo();
    String descripcion = vista.leerDescripcion();
    tarea.setTitulo(titulo);
    tarea.setDescripcion(descripcion);
    vista.mostrarMensaje("Tarea actualizada.");
  }

  public void eliminarTarea(int par) {
    int indice = leerIndiceTarea();
    Task tarea = tareas.get(indice);
    vista.mostrarTarea(tarea.getTitulo(), tarea.getDescripcion(), tarea.getEstado());
    vista.mostrarMensaje("¿Está seguro de que desea eliminar esta tarea? (s/n)");
    String confirmacion = vista.leerTitulo().toLowerCase();
    if (confirmacion.equals("s")) {
      tareas.remove(indice);
      vista.mostrarMensaje("Tarea eliminada.");
    }
  }

  private int leerIndiceTarea() {
    int indice;
    do {
      vista.mostrarMensaje("Ingrese el índice de la tarea (0-" + (tareas.size() - 1) + "):");
      indice = vista.leerOpcion();
      if (indice < 0 || indice >= tareas.size()) {
        vista.mostrarMensaje("Índice no válido.");
      }
    } while (indice < 0 || indice >= tareas.size());
    return indice;
  }

    public Object getTareas() {
        return tareas;
    }

    public void agregarTarea(String titulo, String descripcion, boolean estado) {
    }

    public void agregarTarea(Task tarea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void actualizarTarea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
