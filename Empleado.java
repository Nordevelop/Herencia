package misClases;

public class Empleado extends Persona{
    protected int idEmpleado;
    protected double sueldo;
    protected static int contadorEmpleado;

    public Empleado(String nombre, char genero, int edad, String direccion, double sueldo) {
        super(nombre,genero, edad, direccion);
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
        this.nombre=nombre;
        this.genero =genero;
        this.edad=edad;
        this.direccion=direccion;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}    

    

 
