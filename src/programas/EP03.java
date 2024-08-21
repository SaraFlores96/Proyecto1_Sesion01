package programas;
import java.util.Scanner;
public class EP03 {
    public static void main(String[] args) {
    //Declarando variables  
      String empleado;
      double ie,ge,am,ab,as,aa;
      Scanner lectura=new Scanner(System.in);
    //Entrada de datos
      System.out.print("Nombre de empleado: ");
      empleado=lectura.next();
      System.out.print("Ingresos del empleado: ");
      ie=lectura.nextDouble();
      System.out.print("Gastos del empleado: ");
      ge=lectura.nextDouble();
    //Proceso de Datos
      am=(ie-ge);
      ab=am*2;
      as=am*6;
      aa=am*12;       
//Salida de Datos
      System.out.println("Ahorro Mensual: "+am);
      System.out.println("Ahorro Bimestral: "+ab);
      System.out.println("Ahorro Semestral: "+as);
      System.out.println("Ahorro Anual: "+aa);
    
    }
    }
