/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3;

import java.util.Scanner;

/**
 *
 * @author TRUJEQUE
 */
public class Tarea3 {

    /**
     */
    public static void forSuma() {
     int Suma = 0;
        
        for (int i = 0; i < 10; i++){
            Suma += i;
        }
        
        System.out.println("La suma es: " + Suma);
    }
    
    public static void factorial(){
        
        double factorial = 1;
        
        for (int i = 1; i <= 10; i++) {
            
            factorial *= i;
        }
        
        System.out.println("El factorial de 10 es: " + factorial);
    }
    
    public static void  factorialNum(int numTemp){
        
        int numero = numTemp;
        
        double factorialNum = 1;
        
        for (int i = 1; i <= numero; i++) {
            
            factorialNum *= i;
        }
        
        System.out.println("El  factorial del número es: " + numero + " es: " + factorialNum) ;
    }
    
    public static void media(int numTemp){
        
        int numero = numTemp;
        
        int media = 0;
        
        for (int i = 0; i <= numTemp; i++) {
            
            media += i;
        }
        
        media = (media/numero);
        
        System.out.println("La media del número es: " + media);
    }
    
    public static void PromNum(int numeroTemp){
        
        Scanner entrada = new Scanner(System.in);
        
        int ingresaNumero = numeroTemp;
        
        int sumaAcumulada = 0;
        
        int[] datosIngres = new int [ingresaNumero];
        
        for (int i = 0; i < ingresaNumero; i++) {
            
            System.out.println("Ingrese un numero: ");
            
            datosIngres[i] = entrada.nextInt();
            
            sumaAcumulada += datosIngres[i];
        }
        
        System.out.println("La suma de todos los numeros es: " + sumaAcumulada);
        
        int promedio = sumaAcumulada / ingresaNumero;
        
        System.out.println("El promedio de los números ingresados es: " + promedio);
        
        //Introducir numero  mayor y menor
        
        int mayor, menor;
        
        mayor = menor = datosIngres[0];
        
        for (int i = 0; i < datosIngres.length ; i++) {
            
            if (datosIngres[i] > mayor){
                
                mayor = datosIngres[i];
            }
            if(datosIngres[i] < menor){
                
                menor = datosIngres[i];
            }
            
        }
        
            System.out.println("El número mayor es: " + mayor);
            
            System.out.println("El número menor es: " + menor);
            
        // La distancia numerica entre ellos
            
        int distancia = mayor - menor;
        
        System.out.println("La distancia entre los números es: " + distancia);
        
    }
   
    public static void Dias_de_la_Semana(){
        
        String Dias_de_la_Semana[] = new String [7];
        
        Dias_de_la_Semana[0] = "Lunes";
        Dias_de_la_Semana[1] = "Martes";
        Dias_de_la_Semana[2] = "Miercoles";
        Dias_de_la_Semana[3] = "Jueves";
        Dias_de_la_Semana[4] = "Viernes";
        Dias_de_la_Semana[5] = "Sabado";
        Dias_de_la_Semana[6] = "Domingo";
        
        for (String Dias_de_la_Semana1 : Dias_de_la_Semana) {
            System.out.println(Dias_de_la_Semana1);
        }
    }
    
    public static void JuegoGato(){
        
        String JuegoGato[][] = new String [3][3];
        
       for(String vertical[]: JuegoGato){
            for(String horizontal: vertical){
                System.out.print("+" + " ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        // Imprimir la suma consecutiva del 0 al 10
        
        forSuma();
        
        //Calcular el factorial del 1 al 10
        
        factorial();
        
        //Calcular el factorial de un número que sea introducido por el usuario
        
        System.out.println("Ingrese el número que se desea tener con el factorial: ");
        
        factorialNum(entrada.nextInt());
        
        //Calcular la media de la suma del 0 hasta el número introducido por el usuario
        
        System.out.println("Ingrese un número para tener la media: ");
        
        media(entrada.nextInt());
        
        //Pedir un número y leer n veces números, realizar la suma de los números, sacar el promedio
        //y determinar cuál número introducido es el mayor y cuál el menor, y la distancia numérica entre ellos
        
        System.out.println("¿Cuántos datos ingresara?");
        
        PromNum(entrada.nextInt());
        
        //Imprima un arreglo que tenga los nombres de los días de la semana.
        
        System.out.println("Cuantos dias tiene la semana: ");
        
        Dias_de_la_Semana();
        
        //Imprima un arreglo de 2 dimensiones de 3 X 3 que dibuje el modelo del juego gato.           
        //0,0    0,1   0,2             1,0    1,1   1,2             2,0    2,1   2,2
        System.out.println("Arreglo de 2 dimensiones del  JuegoGato: ");
        
        JuegoGato();
    
        
    
    }
    
}
