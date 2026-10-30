/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopilas;

import java.util.Scanner;

/**
 *
 * @author alexj
 */
public class EjercicioPilas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
       int[] pila = new int [5];
       int tope = -1;
       int opcion;
       do {
           System.out.println("\n -- PILA CON ARRERGLOS");
              System.out.println("1. Agregar un numero a la PILA");
                 System.out.println("2. Retirar un numero de la PILA");
                    System.out.println("3. Mostrar la PILA");
                     System.out.println("4. Mostrar el TOPE");
                      System.out.println("5. Salir");
                       System.out.println("6. Opción");
                       opcion = teclado.nextInt();
                       switch (opcion) {
                           case 1: 
                               if (tope == pila.length-1){
                                   System.out.println("La pila está llena");
                                } else{
                                    System.out.println("Agregue un elemento a la pila");
                               int numero = teclado.nextInt();
                               tope ++;
                               pila [tope]=numero;
                               }
                       break;
                           case 2:
                               if (tope==-1){
                                   System.out.println("La pila está Vacia");
                               }else{
                                   System.out.println("Retirar" + pila [tope]);
                                   tope--;
                               }
                               break;
                           case 3:
                                 if (tope==-1){
                                   System.out.println("La pila está Vacia");
                               }else{
                                   System.out.println("Mostrar la pila de elemento");
                                   for (int i= tope; i>=0 ; i--){ 
                                       System.out.println("Pila" + pila [i]);
                                   }
                                   }
                                 break;
                           case 4:
                               if (tope==-1){
                               System.out.println("La pila está vacia");
                       }else {
                               System.out.println("La pila está vacia " + pila[tope]);
                                   }
                       break;
                       case 5:
                       System.out.println("FIn del programa");
                       break;
                       default:
                       System.out.println("Opcion Invalida");

                               }
       }while (opcion !=5);
       teclado.close();
                   
       }
          
    }
   
