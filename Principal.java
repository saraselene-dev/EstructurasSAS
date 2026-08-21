import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Ingrese la dimensión del parqueadero (Filas)");
        int filas = sc.nextInt();
        System.out.println("Ingrese la dimensión del parqueadero (Columnas)");
        int col = sc.nextInt();

        ObjVehiculo[][] parqueadero = new ObjVehiculo[filas][col];
        Metodos M = new Metodos();

        while (continuar) {
            System.out.println();
            System.out.println("Bienvenidos a Parqueadero Estructura S.A.S");
            System.out.println("Elija la opción que desea realizar");
            System.out.println();
            System.out.println("1) Registrar vehiculos");
            System.out.println("2) Mostrar parqueaderos");
            System.out.println("3) Mostrar carros registrados");
            System.out.println("4) Mostrar motos registrados");
            System.out.println("5) Mostrar propietarios");
            System.out.println("6) Mostrar planes contratados");
            System.out.println("7) Mostrar valor total a pagar por cliente");
            System.out.println("8) Mostrar dinero total recaudado");
            System.out.println("9) Salir");

            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    parqueadero = M.LlenarParqueadero(parqueadero, sc);

                    break;
                case 2:
                    M.MostrarParqueadero(parqueadero);

                    break;
                case 3:
                    System.out.println("===Carros Registrados===");
                    M.MostrarPorTipo(parqueadero, 1);
                    System.out.println("Total Carros: " + M.ContarPorTipo(parqueadero, 1));

                    break;
                case 4:
                    System.out.println("===Motos Registradas===");
                    M.MostrarPorTipo(parqueadero, 2);
                    System.out.println("Total Motos: " + M.ContarPorTipo(parqueadero, 2));

                    break;
                case 5:
                    M.MostrarPropietarios(parqueadero);

                    break;
                case 6:
                    M.MostrarPlanes(parqueadero);

                    break;
                case 7:
                    M.MostrarTotalPorCliente(parqueadero);

                    break;
                case 8:
                    System.out.println("Dinero total recaudado: " + M.RecaudoTotal(parqueadero));

                    break;
                case 9:
                    System.out.println("Gracias" + "¡Hasta luego!");
                    continuar = false;

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "¡Opción inválida, por favor intente de nuevo!");
                    break;
            }

        }

    }

}
