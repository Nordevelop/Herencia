package misClases;

import java.util.Objects;
import misClases.Cliente;
import misClases.Empleado;
import misClases.Proveedor;
import misClases.Director;
import java.util.Date;

public class TestHerencia {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente(new Date(), true, "Karla", 'F', 28, "Saturno 15");
		Cliente cliente2 = new Cliente(new Date(), true, "Rafael", 'M', 56, "San Martin 214");
		Empleado empleado1 = new Empleado("Jorge",'M',50,"Bermand 254",33000);
		Proveedor proveedor1 = new Proveedor(new Date(),201478549,"Karnlandin","Jose","jose marti 254");
		//Director jefe1 = new Director("Ceo",45875, "Mariano", 'M',66, "Billinghust 258");
	
        System.out.println("cliente1 = " + cliente1);
        System.out.println("cliente2 = " + cliente2);
        System.out.println("empleado1 = " + empleado1);
        System.out.println("proveedor1 = " + proveedor1);
        

	}

}
