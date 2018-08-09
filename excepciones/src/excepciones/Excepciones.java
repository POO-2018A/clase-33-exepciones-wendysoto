/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;
import  java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Wendy Soto
 */
public class Excepciones {

     public static int cociente(int numerador, int denominador)
            throws ArithmeticException {
        return numerador / denominador; // posible división entre cero
    } // fin del método cociente

    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner scan=new Scanner(System.in);
         boolean continuar=true;
        
             int n=0;
         
        do{
         try{           
            
             System.out.println("Arreglo de cuanto?");
        n=scan.nextInt();
        
        System.out.println("Ingrese los numeros");       
        int arreglo [] = new int [n];
           for(int i=0; i<arreglo.length; i++){
            
            arreglo[i]=scan.nextInt();          
         
        }
           
         
        System.out.println("los numeros son: ");
        for(int i=0; i<arreglo.length; i++){
            System.out.print(arreglo[i]+",");
            
        }
        System.out.println("");
        
            System.out.println("que elemento desea visualizar?");
            
            int see=scan.nextInt();
            System.out.println( "["+arreglo[see]+"]");
        
          continuar=false;

        }
       catch(InputMismatchException ex){
           
           System.out.println("No es permitido ingresar caracteres...Intente de Nuevo");
           System.err.println(ex);
            scan.nextLine();
       }
         catch(ArrayIndexOutOfBoundsException e){
             
             System.out.println("No existe numero en esa posicion... Intente de Nuevo");
              System.err.println(e);    
         }
         
       catch(Exception error1){
           System.out.println(error1);
       } 
         
         
      }while(continuar);
            
      
         //////////////////////////////////////////
        
   System.out.println("");
   
         boolean correcto=true;
       
        

        do {
            try 
            {
                System.out.println("DIVISION");
                System.out.print("Introduzca un numerador entero: ");
                int numerador = scan.nextInt();
                System.out.print("Introduzca un denominador entero: ");
                int denominador = scan.nextInt();

                int resultado = cociente(numerador, denominador);
                System.out.printf("\nResultado: %d / %d = %d\n", numerador,
                        denominador, resultado);
                correcto = false; 
            } 
            catch (InputMismatchException inputMismatchException) {
                System.err.printf("\nExcepcion: %s\n",
                        inputMismatchException);
                scan.nextLine(); // descarta entrada para que el usuario intente otra vez
                System.out.println(
                        "Debe introducir enteros. Intente de nuevo.\n");
            }
            catch (ArithmeticException arithmeticException) {
                System.err.printf("\nExcepcion: %s\n", arithmeticException);
                System.out.println(
                        "Cero es un denominador invalido. Intente de nuevo.\n");
            } 
        } while (correcto); 
        
        
        /////////////////////////////////////////////////////////
        
        
    }
}
       
        
    
    
    

