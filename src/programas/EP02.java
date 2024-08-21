package programas;
import java.util.Scanner;
public class EP02 {
    public static void main(String[] args) {
    //Declarando variables  
      int sd1,sd2,sd3,sd4,sd5;
      double ts,ps;
      Scanner lectura=new Scanner(System.in);
      //Entrada de datos
      System.out.print("Sueldo 1: ");
      sd1=lectura.nextInt();
      System.out.print("Sueldo 2: ");
      sd2=lectura.nextInt();
      System.out.print("Sueldo 3: ");
      sd3=lectura.nextInt();
      System.out.print("Sueldo 4: ");
      sd4=lectura.nextInt();
      System.out.print("Sueldo 5: ");
      sd5=lectura.nextInt();
      //Proceso de Datos
      ts=(sd1+sd2+sd3+sd4+sd5);
      ps=(ts/5);
      //Salida de Datos
      System.out.println("Total de Sueldo: "+ts);
      System.out.println("Promedio de sueldo: "+ps);
 
    }
    }
