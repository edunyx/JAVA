import java.util.Scanner;

public class CuentaCliente {
    private String usuario;
    private String tipo;
    private double saldo;

    // Constructor para inicializar los datos del cliente
    public CuentaCliente(String usuario, String tipo, double saldo) {
        this.usuario = usuario;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    // Método para mostrar la información del cliente
    private void mostrarInformacion() {
        System.out.println("************************************");
        System.out.println("Nombre del Cliente: " + usuario);
        System.out.println("Tipo de cuenta: " + tipo);
        System.out.println("Saldo Disponible: " + saldo + "$");
        System.out.println("************************************");
    }

    // Método para consultar saldo
    private void consultarSaldo() {
        System.out.println("Su saldo actual es: " + saldo + "$");
    }

    // Método para retirar dinero
    private void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Ha excedido el monto de retiro de su saldo");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Saldo ahora es de: " + saldo + "$");
        }
    }

    // Método para depositar dinero
    private void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito exitoso. Saldo actualizado es de: " + saldo + "$");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CuentaCliente cuenta = new CuentaCliente("Tony Stark", "Cuenta corriente", 1599.99);
        int opcion;

        do {
            cuenta.mostrarInformacion();
            System.out.println("Digite el número a consultar:");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Depositar");
            System.out.println("9 - Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    cuenta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Escriba cuánto desea retirar: ");
                    double cantidadRetirar = teclado.nextDouble();
                    cuenta.retirar(cantidadRetirar);
                    break;
                case 3:
                    System.out.print("Escriba cuánto desea depositar: ");
                    double cantidadDepositar = teclado.nextDouble();
                    cuenta.depositar(cantidadDepositar);
                    break;
                case 9:
                    System.out.println("Programa finalizado, gracias por usar nuestros servicios.");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 9);
        teclado.close();
    }
}