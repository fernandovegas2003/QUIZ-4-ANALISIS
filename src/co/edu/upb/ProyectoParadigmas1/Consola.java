package co.edu.upb.ProyectoParadigmas1;

public class Consola {

	public static void main(String[] args) {
		
		
       Estudiante e1 = new Estudiante("Fernando Vega"," ingenieria en sistemas ");
       Estudiante e2 = new Estudiante("sebastian Vega"," Psicologia ");
       System.out.println("Su nombre es : " + e1.getNombre() + " la carrera que estudia es : " +
       e1.getCarrera());
       System.out.println("Su nombre es : " + e2.getNombre() + " la carrera que estudia es : " +
    	   e2.getCarrera());
    	      
       Empleado e3 = new Empleado ("javier Vega"," Gerente General ");
       Empleado e4 = new Empleado (" horacio Vega"," Abgogado ");
       System.out.println("Su nombre es : " + e3.getNombre() + " Su cargo es : " + e3.getCargo());
       System.out.println("Su nombre es : " + e4.getNombre() + " Su cargo es : " + e4.getCargo());       
       
       Division Divi = new Division ("torre 5",e3 );
      System.out.println ( Divi.getDivision());
	
	} }
		
		


