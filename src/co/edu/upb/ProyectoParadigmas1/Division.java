package co.edu.upb.ProyectoParadigmas1;


public class Division {
	

	private String division;
	private Empleado jefe;
	private Estudiante[] arrayEstudiantes;
	private Empleado[] arrayEmpleados;
	private int contadorEstudiantes = 0;
	private int contadorEmpleados = 0;
	
	public Division(String division,Empleado jefe) {
		this.division = division;
		this.jefe = jefe;
		arrayEmpleados = new Empleado[9];
		arrayEstudiantes= new Estudiante [9];
	}
	
	public void addEmpleado(Empleado Empleado) {
		arrayEmpleados[contadorEmpleados] = Empleado;
		contadorEmpleados ++;
	}
	
	public void addEstudiante(Estudiante Estudiante) {
		arrayEstudiantes[contadorEstudiantes] = Estudiante;
		contadorEstudiantes ++;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public Empleado getJefe() {
		return jefe;
	}

	public void setJefe(Empleado jefe) {
		this.jefe = jefe;
	}

	public Estudiante[] getArrayEstudiantes() {
		return arrayEstudiantes;
	}

	public void setArrayEstudiantes(Estudiante[] arrayEstudiantes) {
		this.arrayEstudiantes = arrayEstudiantes;
	}

	public Empleado[] getArrayEmpleados() {
		return arrayEmpleados;
	}

	public void setArrayEmpleados(Empleado[] arrayEmpleados) {
		this.arrayEmpleados = arrayEmpleados;
	}

	public int getContadorEstudiantes() {
		return contadorEstudiantes;
	}

	public void setContadorEstudiantes(int contadorEstudiantes) {
		this.contadorEstudiantes = contadorEstudiantes;
	}

	public int getContadorEmpleados() {
		return contadorEmpleados;
	}

	public void setContadorEmpleados(int contadorEmpleados) {
		this.contadorEmpleados = contadorEmpleados;
	}
	
	
	
	
	
}