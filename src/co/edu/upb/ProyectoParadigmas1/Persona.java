package co.edu.upb.ProyectoParadigmas1;

public class Persona {
	
	private int edad;
	private String nacionalidad ;
	private String nombre ;
	private double peso;
	private double alutra;
	
	public Persona (String nombre) {
		this.nombre=nombre;
		
		
	}
	
	public double getPesoIdeal() {return 0;}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAlutra() {
		return alutra;
	}
	public void setAlutra(double alutra) {
		this.alutra = alutra;
	}
	
	
	
    
}
	