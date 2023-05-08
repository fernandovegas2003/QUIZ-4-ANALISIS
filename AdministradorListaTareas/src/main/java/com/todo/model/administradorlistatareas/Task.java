/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.model.administradorlistatareas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julic
 */
public class Task {
    private String titulotarea;
    private String codigotarea;
    private String descripcion;
    private String estadotarea;
    private ArrayList<String> Task=new ArrayList<>();

    public String getCodigotarea() {
        return codigotarea;
    }

    public void setCodigotarea(String codigotarea) {
        this.codigotarea = codigotarea;
    }

    public Task(String titulotarea, String descripcion, String estadotarea, String codigotarea) {
        this.titulotarea = titulotarea;
        this.descripcion = descripcion;
        this.estadotarea = estadotarea;
        this.codigotarea=codigotarea;
    }
   

    public String getTitulotarea() {
        return titulotarea;
    }

    public void setTitulotarea(String titulotarea) {
        this.titulotarea = titulotarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstadotarea() {
        return estadotarea;
    }

    public void setEstadotarea(String estadotarea) {
        this.estadotarea = estadotarea;
    }

    public ArrayList<String> getTask() {
        return Task;
    }

    public void setTask(ArrayList<String> Task) {
        this.Task = Task;
    }

    public Task add(Task task) {
        return task;
    }

    public Task remove(Task task) {
        return task;
    }

   
}
