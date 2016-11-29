package Ejercicios;

public class EjecutorCal
{
   public static void main( String args[] )
   {
      Calificaciones calificacion = new Calificaciones();

      calificacion.abrir_archivo();
      calificacion.agregar_informacion();
      calificacion.cerrar_archivo();
   } // fin de main
} // fin de la clase PruebaCrearArchivoTexto

