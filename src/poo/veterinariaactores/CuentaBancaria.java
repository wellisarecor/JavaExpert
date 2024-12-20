package poo.veterinariaactores;

import javax.swing.JOptionPane;

public class CuentaBancaria {

    private String numeroCuenta;
    private Double saldo;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void depositar(Double monto) {
        saldo += monto;
    }

    public void retirar(Double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro Exitoso, su saldo actual es: " + saldo);
        } else {
            System.out.println("Monto excese el saldo actual");
        }
    }

    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria();
        String[] opciones = {"Registrar Cuenta y Saldo", "Depositar", "Retirar", "Ver Saldo", "Salir"};

        // Mostrar el menú usando showOptionDialog
        int seleccion = JOptionPane.showOptionDialog(
                null, // Componente padre (null para que sea centrado)
                "Elige una opción", // Mensaje a mostrar
                "Menú de Opciones", // Título del cuadro de diálogo
                JOptionPane.DEFAULT_OPTION, // Tipo de opción (DEFAULT_OPTION es para elegir entre botones personalizados)
                JOptionPane.INFORMATION_MESSAGE, // Tipo de mensaje
                null, // Icono (null para el predeterminado)
                opciones, // Opciones de los botones
                opciones[0] // Opción predeterminada
        );

       
    }

}
