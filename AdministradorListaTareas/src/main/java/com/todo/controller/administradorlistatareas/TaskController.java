/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.controller.administradorlistatareas;

import com.todo.model.administradorlistatareas.Task;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author julic
 */
public class TaskController {
     private ArrayList<Task> tasks = new ArrayList<Task>();

    public void agregarTask(Scanner scanner) {
        System.out.println("Ingrese los datos de la tarea:");
        System.out.print("Código: ");
        String codigotarea = scanner.next();
        System.out.print("Título: ");
        scanner.nextLine();
        String titulotarea = scanner.nextLine();
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Estado: ");
        String estadotarea = scanner.next();

        Task task = new Task(codigotarea, titulotarea, descripcion, estadotarea);
        tasks.add(task);
        System.out.println("Tarea agregada exitosamente.");
    }

    public boolean eliminarTask(String titulotarea, String codigotarea) {
        for (Task task : tasks) {
            if (task.getTitulotarea().equals(titulotarea) && task.getCodigotarea().equals(codigotarea)) {
                tasks.remove(task);
                return true;
            }
        }
        return false;
    }

    public Task buscarTask(String titulotarea, String codigotarea) {
        for (Task task : tasks) {
            if (task.getTitulotarea().equals(titulotarea) && task.getCodigotarea().equals(codigotarea)) {
                return task;
            }
        }
        return null;
    }

    public Task actualizarTask(Task tareaActualizada) {
        for (Task tarea : tasks) {
            if (tarea.getCodigotarea().equals(tareaActualizada.getCodigotarea())) {
                tarea.setTitulotarea(tareaActualizada.getTitulotarea());
                tarea.setDescripcion(tareaActualizada.getDescripcion());
                tarea.setEstadotarea(tareaActualizada.getEstadotarea());
                System.out.println("La tarea se ha actualizado correctamente.");
                return tarea;
            }
        }
        System.out.println("No se encontró la tarea especificada.");
        return null;
    }
}
