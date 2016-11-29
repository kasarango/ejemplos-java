package Promedio;

/**
 *
 * @author SALAS
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class Calificaciones2 {

    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("datos2.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrirArchivo

    // lee registro del archivo
    public void leer_informacion() {

        try // lee registros del archivo, usando el objeto Scanner
        {
            double promedio = 0;
            double mayor = 0;

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                //System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));
                System.out.println(linea_partes);

                double cal1 = Double.parseDouble(linea_partes.get(2));
                double cal2 = Double.parseDouble(linea_partes.get(3));
                promedio = (cal1 + cal2) / 2;
                
                System.out.printf("Promedio de calificaciones de %s %s es: %.2f\n\n", linea_partes.get(0), linea_partes.get(1), promedio);
                if (promedio > mayor) {
                    mayor = promedio;
                }
            } // fin de while
            System.out.printf("El mejor promedio es: %.2f\n", mayor);
        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del metodo leerRegistros
    // cierra el archivo y termina la aplicación

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del metodo cerrarArchivo
} // fin de la clase LeerArchivoTexto

