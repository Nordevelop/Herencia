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
     this.Registro = Registro;
    this.cuit = cuit;
  }
  /*Metodos
   * Getter & Setter
   */
   public Date registro() {
        return registro;
    }

    public void registro(Date registro) {
        this.registro = Registro;
    }
  
  
  
}
