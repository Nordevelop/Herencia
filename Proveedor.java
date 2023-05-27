package misClases;
import java.util.Date;

public class Proveedor extends Persona{
	
	private int idProveedor;
	private Date registro;
	private int cuit;
	private String razonsocial;
	private static int contadorProveedor;
	  
	public Proveedor(Date registro,int cuit, String razonsocial, String direccion){//metodo constructor
	     super(direccion);
	     this.idProveedor = ++Proveedor.contadorProveedor;
	     this.registro = registro;
	    this.cuit = cuit;
	  }
	  /*Metodos 
	   * Getters y Setters
	   */
	  public int getIdProveedor() {
			return idProveedor;
		}
		public Date getRegistro() {
			return registro;
		}
		public void setRegistro(Date registro) {
			this.registro = registro;
		}
		public int getCuit() {
			return cuit;
		}
		public void setCuit(int cuit) {
			this.cuit = cuit;
		}
		public String getRazonsocial() {
			return razonsocial;
		}
		public void setRazonsocial(String razonsocial) {
			this.razonsocial = razonsocial;
		}
		public static void setContadorProveedor(int contadorProveedor) {
			Proveedor.contadorProveedor = contadorProveedor;
		}
		@Override
		public String toString() {
		     StringBuilder sb = new StringBuilder();
		     sb.append("Proveedor{idProveedor=").append(idProveedor);
		     sb.append(", fechaRegistro= ").append(registro);
		     sb.append("Nro de Cuit= ").append(cuit);
		     sb.append("Razon Social = ").append(razonsocial);
		     sb.append(", ").append(super.toString());
		     sb.append('}');
		     
		     return sb.toString();
		}
		
		
			
			
		}
	
