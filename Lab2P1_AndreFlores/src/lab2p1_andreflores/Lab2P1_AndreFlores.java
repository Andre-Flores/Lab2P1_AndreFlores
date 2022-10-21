
package lab2p1_andreflores;

import java.util.Scanner;

public class Lab2P1_AndreFlores {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Menu");
        System.out.println("1 -> Problema de MCD");
        System.out.println("2 -> Problema de sumatoria");
        System.out.println("3 -> Compra de supermercado");
        System.out.println("4 -> Salida");
        
        int opcion = leer.nextInt();
        if (opcion ==4){
            System.out.println("Saliendo... ");
        }
        while(opcion!=4){
           
       
            if (opcion == 1){
            int a, b;
            System.out.println(" Usted escogio la opcion 1 ");
            System.out.print(" Ingrese el valor de a:  ");
            a = leer.nextInt();
            while (a <= 0){
                System.out.println(" Ingrese un numero mayor que 0. ");
                a = leer.nextInt();
            } // fin while a<= 0
            System.out.print("Ingrese el valor de b:  ");
            b = leer.nextInt();
            while (b <= 0 ){
                System.out.println(" Ingrese un numero mayor que 0.  ");
                b = leer.nextInt();
            } // fin while b <= 0
            while (a != b ){
                if (a > b){
                   a = a - b;
                } // fin de a-b 
                else {
                     b = b - a;
                } //fin else
            } //fin del while
           System.out.println(" su MCD es:  "+ a);      
            
        } //fin de opcion 1
        else if (opcion == 2){
            int K;
            double x = 0.0;
            double sumatoria=0;
            double result=0.0;
            System.out.println(" Usted escogio la opcion 2  ");
            System.out.println(" Ingrese un numero positivo para K:  ");
            K = leer.nextInt();
            while (K <= 0){
                System.out.println(" Ingrese un numero mayor que 0! ");
                K = leer.nextInt();
            } // fin while K<= 0
            double n=1;
            while (n <= K){
             x = n/(n+1);  
             result+=Math.pow(x,n);
             n++;
            } // fin while x<k
            System.out.println(" la sumatoria es:  " + result);
        } // fin opcion 2
        else if (opcion == 3){
            int tipodecliente;
                System.out.print(" Ingrese el tipo de cliente:  ");
                tipodecliente = leer.nextInt();
                if (tipodecliente == 0){
                    double precio;
                    System.out.print(" Ingrese el precio por unidad del producto que lleva:  " );
                    precio = leer.nextDouble(); 
                    int cantidad;
                    System.out.print("Ingrese la cantidad de productos que lleva:  ");
                    cantidad = leer.nextInt();
                    if ( cantidad >= 10 && cantidad <= 19 ){
                        cantidad = cantidad - 2;
                        System.out.println(" la cantidad de productos que lleva es:  " + cantidad);
                    } // fin if cantidad
                    else
                     if ( cantidad > 20){
                      cantidad = cantidad - 5;
                         System.out.println(" la cantidad de productos que lleva es sobre 20, se lleva 5 gratis entonces solo paga: " + cantidad);
                            
                    } // fin else cantidad 20
                     else 
                        if ( cantidad < 10){
                            System.out.println(" la cantidad de productos que lleva es:  " + cantidad);                           
                        } // fin if cantidad 10
                         double preciofinal = (cantidad * precio);
                        System.out.println(" su precio final es de (lps):  " + preciofinal);
                } //fin if tpdc 0
                else if (tipodecliente == 1){
                    double precio;
                    System.out.print(" Ingrese el precio por unidad del producto que lleva:  " );
                    precio = leer.nextDouble(); 
                    int cantidad;
                    System.out.print("Ingrese la cantidad de productos que lleva:  ");
                    cantidad = leer.nextInt();
                    if ( cantidad >= 20 && cantidad <= 29 ){
                        cantidad = cantidad - 2;
                        System.out.println(" la cantidad de productos que lleva es:  " + cantidad);
                    } // fin if cantidad
                    else
                     if ( cantidad > 30){
                      cantidad = cantidad - 5;
                         System.out.println(" la cantidad de productos que lleva es sobre 30, se lleva 5 gratis entonces solo paga: " + cantidad);
                            
                    } // fin else cantidad 30
                     else 
                        if ( cantidad < 20){
                            System.out.println(" la cantidad de productos que lleva es:  " + cantidad);                           
                        } // fin if cantidad 20
                         double preciofinal = (cantidad * precio);
                         double descuento = preciofinal * 0.10;
                         preciofinal = preciofinal - descuento;
                        System.out.println(" su precio final es de (lps):  " + preciofinal);
                    }else if (tipodecliente == 2){
                    double precio;
                    System.out.print(" Ingrese el precio por unidad del producto que lleva:  " );
                    precio = leer.nextDouble(); 
                    int cantidad;
                    System.out.print("Ingrese la cantidad de productos que lleva:  ");
                    cantidad = leer.nextInt();
                    if ( cantidad >= 30 && cantidad <= 39 ){
                        cantidad = cantidad - 2;
                        System.out.println(" la cantidad de productos que lleva es:  " + cantidad);
                    } // fin if cantidad
                    else
                     if ( cantidad > 40){
                      cantidad = cantidad - 5;
                         System.out.println(" la cantidad de productos que lleva es sobre 40, se lleva 5 gratis entonces solo paga: " + cantidad);
                            
                    } // fin else cantidad 40
                     else 
                        if ( cantidad < 30){
                            System.out.println(" la cantidad de productos que lleva es:  " + cantidad);                           
                        } // fin if cantidad 30
                         double preciofinal = (cantidad * precio);
                         double descuento = preciofinal * 0.30;
                         preciofinal = preciofinal - descuento;
                        System.out.println(" su precio final es de (lps):  " + preciofinal);
        } // fin cliente 2 
        }else
            if(opcion == 4) {

            } // fin if op4
        System.out.println("Menu");
        System.out.println("1 -> Problema de MCD");
        System.out.println("2 -> Problema de sumatoria");
        System.out.println("3 -> Compra de supermercado");
        System.out.println("4 -> Salida");
        opcion = leer.nextInt();
        if (opcion ==4){
        System.out.println("Saliendo... ");
        }
        
        } while(opcion!=4);// fin del while opcion 4
        
    } // fin del main
    }   
 // fin de class
