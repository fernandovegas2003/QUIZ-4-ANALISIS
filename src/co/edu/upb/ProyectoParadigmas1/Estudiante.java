package co.edu.upb.ProyectoParadigmas1;

public class Estudiante extends Persona {
	
	private double promedio;
	private int semestre;
	private String carrera;
	
		public Estudiante(String nombre, String carrera) {
			super(nombre);
			this.carrera=carrera;
		}


		public double getPromedio() {
			return promedio;
		}


		public void setPromedio(double promedio) {
			this.promedio = promedio;
		}


		public int getSemestre() {
			return semestre;
		}


		public void setSemestre(int semestre) {
			this.semestre = semestre;
		}


		public String getCarrera() {
			return carrera;
		}


		public void setCarrera(String carrera) {
			this.carrera = carrera;
		}
		
		
		
		
		
	}
	
	

