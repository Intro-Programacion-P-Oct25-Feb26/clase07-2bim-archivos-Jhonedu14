/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura05;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author USUARIO
 */
public class Estadistica {
   
    public static double obtenerPromedioEmpleados() {

        double suma = 0;
        int contador = 0;

        try {
            Scanner entrada = new Scanner(new File("data/sucursales.txt"));

            while (entrada.hasNextLine()) {
                String linea = entrada.nextLine();
                /*Se repite mientras existan líneas en el archivo
                Cada vuelta procesa una empresas y asi sucesivamente   
                */

                try {
                    List<String> lista = Arrays.asList(linea.split("\\|"));
                    ArrayList<String> partes = new ArrayList<>(lista);

                    if (partes.size() < 5) {
                        throw new Exception("Línea incompleta");
                        /*Aqui es para que lea cada uno de lineas de las
                        sucursales y no se pase de la posicion 4
                        */
                    }

                    double empleados = Double.parseDouble(partes.get(2));

                    suma = suma + empleados;
                    contador = contador + 1;
                    /*Aqui creo una variable suma y lo sumo mas empleados de ahi
                    contador va aumentador mas uno y continua mediante el 
                    archivo data/sucursales 
                    */

                } catch (Exception e) {
                    continue;
                    /* Este aqui si es que si existe un error continua a la 
                    siguiente linea 
                    */
                }
            }

        } catch (Exception e) {
            System.out.println("Error al abrir el archivo");
            return 0;
        }

        if (contador == 0) {
            return 0;
        }
        double promedio;
        promedio = (double)suma / contador;

        promedio = Math.round(promedio);
        /* Aqui investigue una variable para el math round que es para rondear
       por que quedaria con decimales las  personas y con esta variable queda 73
        Este variable fue sacada de biblioteca.
        */
        return promedio;
    }
}
