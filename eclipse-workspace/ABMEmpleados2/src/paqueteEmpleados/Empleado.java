package paqueteEmpleados;

public class Empleado {
	private int legajo;
	private String dni;
	private String nombre;
	private String apellido;
	private String telefono;
	private double sueldo;
	
	public Empleado(int  legajo, String dni, String nombre, String apellido, String telefono, double sueldo) {
		super();
		this.legajo = legajo;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.sueldo = sueldo;
	}
	
	
}
