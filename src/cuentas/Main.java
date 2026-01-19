package cuentas;

/**
 * Clase principal que demuestra las operaciones con cuentas
 */
public class Main {

    /**
     * Punto de entrada principal
     * @param args Argumentos de línea de comandos
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
     * Realiza operaciones sobre una cuenta (retiro e ingreso)
     * @param cuenta1 La cuenta sobre la que operar
     * @param cantidad Cantidad a ingresar
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
