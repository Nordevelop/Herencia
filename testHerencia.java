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
		Empleado empleado2 = new Empleado("Luis",'M',35,"Belgrano 84",45000);
		Proveedor proveedor1 = new Proveedor(new Date(),201478549,"Karnlandin","Jose","jose marti 254");
		Proveedor proveedor2 = new Proveedor(new Date(),192458714,"Heshneiker","Carlos","La Rioja 467");
		Director director1 = new Director("jose", 'M',55,"Billinghust 158",250000,"A 16");
		Director director2 = new Director("Josefina", 'F',27,"Boulogn sur mer 874",60000,"C 06");
	
        System.out.println("cliente1 = " + cliente1);
        System.out.println("cliente2 = " + cliente2);
        System.out.println("empleado1 = " + empleado1);
        System.out.println("empleado2 = " + empleado2);
        System.out.println("proveedor1 = " + proveedor1);
        System.out.println("proveedor2 = " + proveedor2);
        System.out.println("Director1 = " + director1);
        System.out.println("Director2 = " + director2);

	}

}
