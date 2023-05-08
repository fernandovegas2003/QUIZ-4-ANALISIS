/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.view.administradorlistatareas;

import com.todo.controller.administradorlistatareas.TaskController;
import com.todo.model.administradorlistatareas.Task;
import java.util.Scanner;

/**
 *
 * @author julic
 */
public class ConsoleView {
    public static void main(String[] args){
        TaskController taskController=new TaskController();
        
        int opciontarea=0;
        int general=0;
        
        do{
            Scanner scanner= new Scanner(System.in);
            System.out.println("¿Qué quieres?");
            System.out.println("1.Crear tarea");
            System.out.println("2.Buscar tarea");
            System.out.println("3.Eliminar tarea");
            System.out.println("4.Actualizar tarea");
            System.out.println("5.Salir");
            System.out.println("Ingrese su opción:");
            general=scanner.nextInt();
            
            switch(general){
                case 1: //crear tarea
                    System.out.println("Ingrese el titulo de la tarea:");
                    String titutotarea= scanner.next();
                    System.out.println("Ingrese el codigo de la tarea:");
                    String codigotarea= scanner.next();
                    System.out.println("Ingrese el descripcion de la tarea:");
                    String descripcion= scanner.next();
                    System.out.println("Ingrese el estado de la tarea:");
                    String estadotarea= scanner.next();
                    
                    //TaskController taskController= TaskController.agregarTask();
                    break;
                case 2:
                    System.out.println("Ingrese el titulo de la tarea:");
                    String titutotarea= scanner.next();
                    System.out.println("Ingrese el codigo de la tarea:");
                    String codigotarea= scanner.next();
                    break;
                
            }
        }while(opciontarea!=5);
        
    }
}
