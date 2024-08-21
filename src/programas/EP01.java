package programas;
import java.util.Scanner;
public class EP01 {
     public static void main(String[] args) {
      //Declarando variables  
      String cliente,producto;
      double nc,pd,pr,c,st,igv,tp;
      Scanner lectura=new Scanner(System.in);
      //Entrada de datos
      System.out.print("Nombre del cliente: ");
      cliente=lectura.next();
      System.out.print("Producto: ");
      producto=lectura.next();
      System.out.print("Precio: ");
      pr=lectura.nextDouble();
      System.out.print("Cantidad: ");
      c=lectura.nextDouble();
      //Proceso de Datos
      st=(pr*c);
      igv=(st*0.18);
      tp=(st-igv);
            //Salida de Datos
      System.out.println("SubTotal: "+st);
      System.out.println("IGV: "+igv);
      System.out.println("Total Pagar: "+tp);
       
      }   

}
