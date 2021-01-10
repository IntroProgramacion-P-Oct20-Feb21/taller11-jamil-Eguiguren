/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        obtenerPromedio();
    }
    public static void obtenerPromedio() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double suma;
        double promedio;
        System.out.println("Ingrese el valor de la nota1: ");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese el valor de la nota2: ");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese el valor de la nota3: ");
        nota3 = entrada.nextDouble();
        System.out.println("Ingrese el valor de la nota4: ");
        nota4 = entrada.nextDouble();
        suma = nota1 + nota2 + nota3 +nota4;
        promedio = suma / 4;
        if (promedio > 0 && promedio < 5){
            System.out.printf("El promedio de las notas: %.2f,%.2f,%.2f,%.2f es Regular¨, \n"
                    , nota1,nota2, nota3,nota4);
        }else{
            if (promedio > 5.1 && promedio < 8){
                System.out.printf("El promedio de las notas: %.2f,%.2f,%.2f,%.2f es Bueno¨, \n"
                        , nota1,nota2, nota3,nota4);

            }else{
                  if (promedio > 5.1 && promedio < 8){
                     System.out.printf("El promedio de las notas: %.2f,%.2f,%.2f,%.2f es Bueno¨, \n"
                             , nota1,nota2, nota3,nota4);

                }else{
                     if (promedio > 8.1 && promedio < 9){
                     System.out.printf("El promedio de las notas: %.2f,%.2f,%.2f,%.2ff es Muy Bueno¨, \n" 
                             , nota1,nota2, nota3,nota4);

                  }else{
                         
                         if (promedio > 8.1 && promedio < 9){
                             System.out.printf("El promedio de las notas: %.2f,%.2f,%.2f,%.2f es Sobresaliente¨, \n"
                                 , nota1,nota2, nota3,nota4);

                         }
                }     
              }
          }
       }

        
    }
}    
