package cuentas;

public class Main {
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es: " + saldoActual);

        try {
            operativa_cuenta(cuenta1, 2300); // Llamada al nuevo método con el parámetro cantidad
        } catch (Exception e) {
            System.out.print("Fallo al operar con la cuenta");
        }
    }

    
    private static void operativa_cuenta(CCuenta cuenta, double cantidad) throws Exception {
        cuenta.retirar(cantidad);

        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
