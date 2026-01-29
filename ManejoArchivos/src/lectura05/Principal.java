/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura05;

/**
 *
 * @author USUARIO
 */
public class Principal {
    public static void main(String[] args) {

        double promedio = Estadistica.obtenerPromedioEmpleados();

        System.out.println("Promedio de empleados de todas las empresas: " +
                promedio);
    }
}

