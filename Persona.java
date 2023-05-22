package misClases;
import java.util.io.BufferedReader;
import java.util.FormatFlagsConversionMismatchException;

public class Persona {
	private String nombre;
	private char genero;
	private int edad;
	private String calle;
	private int altura;
	private String localidad;
		public Persona(String nombre) {
		// TODO Apéndice de constructor generado automáticamente
	}
  //Getters & Setters
  //(:/cuac!! no me gustan
  /*
   *Hay que aprenderlos x los patrones de diseño
   */

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", calle=" + calle + ", altura="
				+ altura + ", localidad=" + localidad + "]";
	}

}
