
package poo.veterinariaactores;


public class Persona {
    public String nombre;
    public String apellidos;
    public int edad;
    
    void mostrarPersona(){
        System.out.println("Datos de la Persona");
        System.out.println("Mi nombre es: "+nombre+" "+apellidos+" y tengo "+edad+" años de edad");
    }
            
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "WELLIS GILBERTO";
        persona1.apellidos = "AREVALO CORDOVA";
        persona1.edad = 29;

        persona1.mostrarPersona();
    }
}
