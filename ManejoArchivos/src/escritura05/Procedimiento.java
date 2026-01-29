/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;
import java.util.Formatter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
/**
 *
 * @author USUARIO
 */
public class Procedimiento {
     public static void agregarRegistros(String valor, String nombreArchivo) {
    String ruta = String.format("data/%s.txt", nombreArchivo);

    try {
        FileOutputStream fos = new FileOutputStream(ruta, true);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        Formatter salida = new Formatter(osw);

        salida.format("%s", valor);
        salida.close();

    } catch (Exception e) {
        System.err.println("Error al crear el archivo.");
    }
}
}
