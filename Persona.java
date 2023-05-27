package misClases;
import java.util.io.BufferedReader;
import java.util.FormatFlagsConversionMismatchException;
public class Persona{
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    /*en las clases derivadas no hace 
     * falta metodo ToString para los objetos
     * de esta clase, solo la llamada a Super()    */
    
    public Persona(){
        
    }
    
    public Persona(String nombre,String direccion){
        this.nombre = nombre;
        this.direccion=direccion;
    }

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}


