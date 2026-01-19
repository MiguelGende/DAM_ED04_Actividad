package cuentas;

/**
 * Clase que representa una cuenta bancaria con operaciones básicas
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros
     * @param nom Nombre del titular de la cuenta
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Asigna un nombre al titular de la cuenta
     * @param nom Nombre a asignar
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Obtiene el nombre del titular de la cuenta
     * @return Nombre del titular
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Obtiene el saldo actual de la cuenta
     * @return Saldo actual
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta
     * @param cantidad Cantidad a retirar
     * @throws Exception Si la cantidad es negativa o excede el saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    /**
     * Obtiene el número de cuenta
     * @return Número de cuenta
     */
    public String obtenerCuenta() {
        return cuenta;
    }

    /**
     * Obtiene el nombre del titular
     * @return Nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular
     * @param nombre Nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta
     * @return Número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta
     * @param cuenta Número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual
     * @return Saldo actual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo
     * @param saldo Saldo a establecer
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés
     * @return Tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés
     * @param tipoInterés Tipo de interés a establecer
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
