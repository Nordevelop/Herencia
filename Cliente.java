package misClases;
import java.ClassCastException;
import java.util.Date;
public class Cliente extends Persona{
	public Cliente(String nombre) {
		super(nombre);
		// TODO Apéndice de constructor generado automáticamente
	}
	private int idCliente;
	private Date fechaRegistro;
	private boolean vip;
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	

}
