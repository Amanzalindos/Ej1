package Potencia;
import java.util.Scanner;

       public class Potencia{
        private static Scanner sc =new Scanner(System.in);
        public static void main(String []args){
        
            /*Ingreso de variables*/
            
        System.out.println("Digite un numero base: ");  /*1*/
           int base=sc.nextInt();
        System.out.println("Ingrese un numero exponente: ");  /*2*/
           int exponente=sc.nextInt();
            
           /*Calculo e impresion del resultado*/
            
           System.out.println("El resultado es: "+base + exponente +Potencia(base, exponente));
           System.out.println("Gracias por utilizar el programa.");
        }
        public static int Potencia(int base, int exponente){
            if(exponente==0)
                return 1;
             else
                return base * Potencia(base, exponente -1);

}
    }
    
