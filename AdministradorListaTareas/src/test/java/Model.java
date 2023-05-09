/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.todo.model.administradorlistatareas.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author julic
 */
public class ModelTest {
    @Test
    public void testConstructor() {
        Task task = new Task("title", "description", true);
        Assertions.assertEquals("title", task.getTitulo());
        Assertions.assertEquals("description", task.getDescripcion());
        Assertions.assertEquals(true, task.getEstado());
    }

    @Test
    public void testGetEstadoString() {
        Task task1 = new Task("title1", "description1", true);
        Assertions.assertEquals("Completada", task1.getEstadoString());
        Task task2 = new Task("title2", "description2", false);
        Assertions.assertEquals("Pendiente", task2.getEstadoString());
    }

    @Test
    public void testSetTitulo() {
        Task task = new Task("title", "description", true);
        task.setTitulo("new title");
        Assertions.assertEquals("new title", task.getTitulo());
    }

    @Test
    public void testSetDescripcion() {
        Task task = new Task("title", "description", true);
        task.setDescripcion("new description");
        Assertions.assertEquals("new description", task.getDescripcion());
    }

    @Test
    public void testSetEstado() {
        Task task = new Task("title", "description", true);
        task.setEstado(false);
        Assertions.assertEquals(false, task.getEstado());
    }
}
