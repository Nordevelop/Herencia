package misClases;

public class Director extends Empleado {
	
	  private String categoria;
	  public Director(String nombre, char genero, 
			  int edad, String direccion, double sueldo, String categoria) {//parametros del metodo constructor
			super(nombre, genero, edad, direccion, sueldo);
			this.categoria=categoria;
			/*
			 * nombre, genero, edad, direccion
			 * es objetos de la clase Persona
			 * 
			 * sueldo es objeto de la clase Empleado
			 * categoria es objeto de la clase Director
			 */
			}//fin metodo constructor
	  		public String getCategoria() {
	  			return categoria;
	  		}
	  		public void setCategoria(String categoria) {
	  			this.categoria = categoria;
	  		}
	  		public String toString() {
	  			StringBuilder sb = new StringBuilder();
	  			sb.append("categoria = ").append(categoria);
	  			sb.append(", ").append(super.toString());
	  			sb.append('}');
	  			return sb.toString();
	  		}
	  
}
