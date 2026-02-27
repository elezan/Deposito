package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 * Permite realizar operaciones de ingreso y retirada de dinero.
 * 
 * @author Llorenc Sastre
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta() {
    }

    /**
 * Constructor con parámetros para inicializar la cuenta.
 *
 * @param nom Nombre del titular
 * @param cue Número de cuenta
 * @param sal Saldo inicial
 * @param tipo Tipo de interés
 */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    // GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    // MÉTODOS

    /**
 * Devuelve el saldo actual de la cuenta.
 *
 * @return saldo actual
 */
    public double estado() {
        return saldo;
    }

    /**
 * Ingresa una cantidad de dinero en la cuenta.
 *
 * @param cantidad cantidad de dinero a ingresar
 * @throws Exception si la cantidad es negativa
 */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
 * Retira una cantidad de dinero de la cuenta.
 *
 * @param cantidad cantidad de dinero a retirar
 * @throws Exception si la cantidad es negativa o no hay saldo suficiente
 */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }
}