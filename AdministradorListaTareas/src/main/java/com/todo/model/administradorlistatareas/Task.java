/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.model.administradorlistatareas;

/**
 *
 * @author julic
 */
public class Task {
  private String titulo;
  private String descripcion;
  private boolean estado;

  public Task(String titulo, String descripcion, boolean estado) {
    this.titulo = titulo;
    this.descripcion = descripcion;
    this.estado = estado;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  
  public String getEstadoString() {
  return estado ? "Completada" : "Pendiente";
}

  public boolean getEstado() {
    return estado;
  }

  public void setEstado(boolean estado) {
    this.estado = estado;
  }
}
