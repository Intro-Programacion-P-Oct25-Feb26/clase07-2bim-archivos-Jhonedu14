/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String cadenaFinal = "";
        int intentos;
        boolean bandera = true;

        while (bandera) {

            cadenaFinal = "";

            System.out.println("Ingrese su cédula:");
            String cedula = entrada.nextLine();

            System.out.println("Ingrese su nombre:");
            String nombre = entrada.nextLine();

            System.out.println("Ingrese tipo de carro:");
            String tipoCarro = entrada.nextLine();

            System.out.println("Ingrese placa del carro:");
            String placa = entrada.nextLine();

            System.out.println("Ingrese s si no quiere ingresar mas:");
            String opcionSalida = entrada.nextLine();

            if (opcionSalida.equals("s")) {
                bandera= false;
            }
            String letra = placa.substring(0, 1).toUpperCase();

            String archivo;

            switch (letra) {
                case "L":
                    archivo = "L";
                    break;

                case "G":
                    archivo = "G";
                    break;

                case "P":
                    archivo = "P";
                    break;

                default:
                    archivo = "otros";
                    break;
            }
            cadenaFinal = String.format("%s | %s | %s | %s\n",
                        cedula, nombre, tipoCarro, placa);
            Procedimiento.agregarRegistros(cadenaFinal, archivo);
        }
        System.out.println("Datos guardados correctamente.");
    }
}
