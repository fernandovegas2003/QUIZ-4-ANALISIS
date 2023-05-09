/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.todo.model.administradorlistatareas.Task;
import com.todo.controller.administradorlistatareas.TaskController;
import com.todo.view.administradorlistatareas.ConsoleView;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author julic
 */
public class ControllerTest {
private TaskController controller;
    private ConsoleView view;
    
    @BeforeEach
    public void setUp() {
        view = new ConsoleView();
        controller = new TaskController(view);
    }
    
    @Test
    public void testAgregarTarea() {
        // Arrange
        String titulo = "Hacer la tarea";
        String descripcion = "Hacer la tarea de matemáticas antes del viernes";
        String estado = "false";

        // Act
        controller.agregarTarea(titulo, descripcion, estado);

        // Assert
        List<Task> tareas = (List<Task>) controller.getTareas();
        assertNotNull(tareas);
        assertEquals(1, tareas.size());
        Task tarea = tareas.get(0);
        assertEquals(titulo, tarea.getTitulo());
        assertEquals(descripcion, tarea.getDescripcion());
        assertFalse(tarea.getEstado());
    }
    
    @Test
    public void testVerTareasSinTareas() {
        // Arrange
        String mensajeEsperado = "No hay tareas.";
        
        // Act
        controller.verTareas();
        
        // Assert
        assertEquals(mensajeEsperado, view.getMensaje());
    }
    
    @Test
    public void testVerTareasConTareas() {
        // Arrange
        String titulo = "Hacer la tarea";
        String descripcion = "Hacer la tarea de matemáticas antes del viernes";
        boolean estado = false;
        controller.agregarTarea(titulo, descripcion, estado);
        String mensajeEsperado = titulo + ": " + descripcion + " (Pendiente)";
        
        // Act
        controller.verTareas();
        
        // Assert
        assertEquals(mensajeEsperado, view.getMensaje());
    }
    
    @Test
    public void testActualizarTarea() {
        // Arrange
        ConsoleView vista = new ConsoleView();
        TaskController controller = new TaskController(vista);
        Task tarea = new Task("Hacer la tarea", "Hacer la tarea de matemáticas antes del viernes", false);
        controller.agregarTarea(tarea);

        vista.agregarOpcion("0");
        vista.agregarOpcion("2");
        vista.agregarEntrada("Hacer la tarea actualizada");
        vista.agregarEntrada("Hacer la tarea de matemáticas antes del sábado");

        // Act
        controller.actualizarTarea();

        // Assert
        List<Task> tareas = (List<Task>) controller.getTareas();
        assertEquals(1, tareas.size());

        tarea = tareas.get(0);
        assertEquals("Hacer la tarea actualizada", tarea.getTitulo());
        assertEquals("Hacer la tarea de matemáticas antes del sábado", tarea.getDescripcion());
    }
    
    @Test
    public void testEliminarTarea() {
        // Arrange
        String titulo = "Hacer la tarea";
        String descripcion = "Hacer la tarea de matemáticas antes del viernes";
        boolean estado = false;
        controller.agregarTarea(titulo, descripcion, estado);
        
        // Act
        controller.eliminarTarea(1);
        
        // Assert
        assertTrue((boolean) controller.getTareas());
    }
    
}
