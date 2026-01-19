package cuentas;

/**
 * Class representing a bank account with basic operations
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Default constructor
     */
    public CCuenta() {
    }

    /**
     * Constructor with parameters
     * @param nom Account holder name
     * @param cue Account number
     * @param sal Initial balance
     * @param tipo Interest rate
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Assigns a name to the account holder
     * @param nom Name to assign
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Gets the account holder name
     * @return Account holder name
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Gets the current balance
     * @return Current balance
     */
    public double estado() {
        return saldo;
    }

    /**
     * Deposits an amount into the account
     * @param cantidad Amount to deposit
     * @throws Exception If the amount is negative
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Withdraws an amount from the account
     * @param cantidad Amount to withdraw
     * @throws Exception If the amount is negative or exceeds balance
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
     * Gets the account number
     * @return Account number
     */
    public String obtenerCuenta() {
        return cuenta;
    }

    /**
     * Gets the account holder name
     * @return Account holder name
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the account holder name
     * @param nombre Account holder name
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets the account number
     * @return Account number
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Sets the account number
     * @param cuenta Account number
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Gets the current balance
     * @return Current balance
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Sets the current balance
     * @param saldo Balance to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Gets the interest rate
     * @return Interest rate
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Sets the interest rate
     * @param tipoInterés Interest rate to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
