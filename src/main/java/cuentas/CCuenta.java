package cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria.
 *
 * @author Álvaro Bajo Tabero
 * @version 1.0
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor sin parámetros de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros de la clase CCuenta.
     *
     * @param nom     El nombre del titular de la cuenta.
     * @param cue     El número de cuenta.
     * @param sal     El saldo inicial de la cuenta.
     * @param tipo    El tipo de interés asociado a la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Obtiene el estado actual del saldo.
     *
     * @return El saldo actual de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Realiza un ingreso en la cuenta.
     *
     * @param cantidad La cantidad a ingresar en la cuenta.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Realiza una retirada de dinero de la cuenta.
     *
     * @param cantidad La cantidad a retirar de la cuenta.
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
