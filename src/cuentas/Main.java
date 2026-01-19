package cuentas;

/**
 * Main class demonstrating account operations
 */
public class Main {

    /**
     * Main entry point
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es: " + saldoActual);

        operativa_cuenta(cuenta1, 695.0f);
    }

    /**
     * Performs account operations (withdraw and deposit)
     * @param cuenta1 The account to operate on
     * @param cantidad Amount to deposit
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
