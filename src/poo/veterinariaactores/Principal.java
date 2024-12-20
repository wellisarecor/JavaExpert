package poo.veterinariaactores;

public class Principal {

    public static void main(String[] args) {

        Perro objPerruno = new Perro();
        objPerruno.nombre = "Nieve";
        objPerruno.edad = 3;
        objPerruno.peso = 3.5;
        objPerruno.estaenfermo = true;

        objPerruno.codigoperruno = "PERR001";
        objPerruno.imprimircodigoPerruno();
        objPerruno.imprimirDatos();

    }
}
//si puede ingresar a sistemas 2
