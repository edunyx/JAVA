import java.util.Scanner;

public class CuentaCliente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuario = "Tony Stark";
        String tipo = "Cuenta corriente";
        double saldo = 1599.99;
        double retirar = 0;
        double depositar = 0;
        int opcion ;



        do {

            System.out.println("************************************");
            System.out.println("");

            System.out.println("Nombre del Cliente: " + usuario);
            System.out.println("Tipo de cuenta: " + tipo );
            System.out.println("Saldo Disponible: "+ saldo + "$");
            System.out.println("");
            System.out.println("************************************");
            System.out.println("Digite el numero a consultar:");

            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Despositar");
            System.out.println("9 - Salir");
            System.out.println("");
            opcion =teclado.nextInt();


            switch (opcion){
                case 1:
                    System.out.println("Su saldo actual es: " + saldo + "$");
                    break;
                case 2:
                    System.out.println("Escriba cuanto desea retirar: ");
                    retirar = teclado.nextDouble();

                    if(saldo>retirar){
                        saldo = saldo - retirar;
                        System.out.println("Saldo ahora es de: " + saldo + "$");

                    }else{
                        System.out.println("Ha excedido el monto de retiro de su saldo" );

                    }

                    break;
                case 3:
                    System.out.println("Escriba cuanto desea depositar: ");

                    depositar = teclado.nextDouble();
                    saldo = saldo + depositar;


                    System.out.println("Saldo actualizado es de: "+ saldo+"$" );
                    break;
                case 9:
                    System.out.println("Salir");
                    System.out.println("Programa finalizado, gracias por usar nuestro servicios. ");
                    break;
                default:
                    System.out.println("Opción no válida");


            }

        }
        while (opcion!=9);
        teclado.close();
    }


}

