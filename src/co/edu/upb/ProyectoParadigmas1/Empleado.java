package co.edu.upb.ProyectoParadigmas1;

public class Empleado extends Persona {
	
	private String cargo;
	private int mesesExperiencia;
	private double sueldo;
	
	public Empleado(String nombre , String Cargo) {
		super(nombre);
		this.cargo = Cargo;
		
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getMesesExperiencia() {
		return mesesExperiencia;
	}

	public void setMesesExperiencia(int mesesExperiencia) {
		this.mesesExperiencia = mesesExperiencia;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
	
}
