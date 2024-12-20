package poo.veterinariaactores;

public class Mascota {

    public String nombre;
    protected int edad;
    public double peso;
    public boolean estaenfermo;
    
    public Mascota(String nombre,int edad,double peso,boolean estaenfermo){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
        this.estaenfermo=estaenfermo;
    }
    public Mascota(){
        
    }
    public Mascota(int edad){
        if(edad > 0){
            this.edad = edad;
        }else{
            System.out.println("No recibimos mascotas recién nacidas");
        }
    }

    public void dormir() {
        System.out.println("mascota durmiendo");
    }

    public void comer() {
        System.out.println("mascota comiendo");
    }
    public void imprimirDatos(){
        System.out.println("El nombre de la mascota es: "+this.nombre+" Edad: "+edad+" "+peso+" su estado es: "+this.estaenfermo);
        
    }
}
