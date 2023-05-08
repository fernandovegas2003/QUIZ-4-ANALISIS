/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.todo.model.administradorlistatareas.Task;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author julic
 */
public class ControllerTest {
    
private ControllerTest controllerTest;
    private Task task1;
    private Task task2;
    private Task task3;
    
    public void setUp() {
        controllerTest = new ControllerTest();
        task1 = new Task("Comprar leche", "1001", "Ir al supermercado y comprar leche", "pendiente");
        task2 = new Task("Ir al médico", "1002", "Ir al hospital para chequeo médico", "en progreso");
        task3 = new Task("Pagar facturas", "1003", "Pagar facturas de servicios públicos", "completado");
    }
    
    @Test
    public void testAgregarTask() {
        controllerTest.agregarTask(task1);
        assertEquals(1, controllerTest.getTasks().size());
        assertEquals(task1, controllerTest.getTasks().get(0));
    }
    
    @Test
    public void testEliminarTask() {
        controllerTest.agregarTask(task1);
        controllerTest.agregarTask(task2);
        controllerTest.agregarTask(task3);
        assertTrue(controllerTest.eliminarTask("Ir al médico", "1002"));
        assertEquals(2, controllerTest.getTasks().size());
        assertFalse(controllerTest.getTasks().contains(task2));
    }
    
    @Test
    public void testEliminarTaskNoEncontrado() {
        controllerTest.agregarTask(task1);
        assertFalse(controllerTest.eliminarTask("Ir al médico", "1002"));
        assertEquals(1, controllerTest.getTasks().size());
    }
    
    @Test
    public void testBuscarTask() {
        controllerTest.agregarTask(task1);
        controllerTest.agregarTask(task2);
        controllerTest.agregarTask(task3);
        assertEquals(task2, controllerTest.buscarTask("Ir al médico", "1002"));
    }
    
    @Test
    public void testBuscarTaskNoEncontrado() {
        controllerTest.agregarTask(task1);
        assertNull(controllerTest.buscarTask("Ir al médico", "1002"));
    }
    
}
