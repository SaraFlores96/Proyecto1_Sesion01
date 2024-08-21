
package programas;

import java.util.Scanner;

public class Progama02 {
      public static void main(String[] args) {
      //Declarando variables
      String empleado;
      double ht,th,sb,d,sn;
      //Creando objetos lectura
      Scanner lectura=new Scanner(System.in);
      //Entrada de datos
      System.out.print("Nombre de empleado: ");
      empleado=lectura.next();
      System.out.print("Horas trabajadas: ");
      ht=lectura.nextDouble();
      System.out.print("Tarifa por hora: ");
      th=lectura.nextDouble();
      //Proceso de Datos
      sb=ht*th;
      d=sb*0.13;
      sn=sb-d;
      //Salida de Datos
      System.out.println("Sueldo bruto: "+sb);
      System.out.println("Descuento: "+d);
      System.out.println("Sueldo neto: "+sn);
 
      }   
}
