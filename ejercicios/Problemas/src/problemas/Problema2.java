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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int opcion;
        System.out.println("Ingrese una de las tres opciones: \n");
        System.out.println("Ingrese 1 para sacar el area de un cuadrado: \n"
                + "Ingrese 2 para sacar el area de un triangulo: \n "
                + "Ingrese 3 para sacar el area de un rectangulo: \n");
        opcion = entrada.nextInt();
        if(opcion==1){
            obtenerAreaCuadrado();
        }else{
            if(opcion==2){
             obtenerAreaTriangulo();    
            }else{
                if(opcion==3){
                    obtenerArearectangulo();   
                }else{
                      System.out.println("Error, intete colocar los numero presentados");  
                        }          
            }
        }
        
    } 
    public static void obtenerAreaCuadrado(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double lado;
        double area;
        System.out.println("Ingrese el valor del lado del cuadrado: ");
        lado = entrada.nextDouble();
        area = lado * lado;
        System.out.println("El area del cuadrado es: " + area);   
    }
    public static void obtenerAreaTriangulo(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese el valor de la base del triangulo: ");
        base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura del triangulo: ");
        altura = entrada.nextDouble();
        area = (base * altura)/2;
        System.out.println("El area del triangulo es: " + area);    
    } 
    public static void obtenerArearectangulo(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double base;
        double altura;
        double area;
        System.out.println("Ingrese el valor de la base del recctangulo: ");
        base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura del rectangulo: ");
        altura = entrada.nextDouble();
        area = base * altura;
        System.out.println("El area del rectangulo es: " + area); 
        
        
    }
}

