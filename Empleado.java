package misClases;
import java.util.*;
public class Empleado extends Persona{
  public Empleado(String nombre, double sueldo) {
		super(nombre);
	}
	private int legajo;
	private double sueldo;
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	

}
  
