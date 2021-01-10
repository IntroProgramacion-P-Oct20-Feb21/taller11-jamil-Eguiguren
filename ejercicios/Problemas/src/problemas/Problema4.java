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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int opcion;
        System.out.println("Ingrese una de las tres opciones: \n");
        System.out.println("Ingrese 1 para sacar el valor de la plantilla de luz: \n" +
                           "Ingrese 2 para sacar el valor del predio de un bien inmueble: \n");
        opcion = entrada.nextInt();
        if (opcion == 1){
            calcularValorLuz();
        }else{
            if (opcion == 2){
                calcularprecio();
            }
        }
    }
    public static void calcularValorLuz() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cedula;
        String nombre;
        double kilovatio;
        double numeroki;
        double valor;
        System.out.println("Ingrese su nombre COMPLETO: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su numero de cedula: ");
        cedula = entrada.nextLine();
        System.out.println("Ingrese el valor del kilovatio: ");
        kilovatio = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilovatios al mes: ");
        numeroki = entrada.nextDouble();
        valor = kilovatio * numeroki ;
        System.out.printf("Cliente %s con cedula %s debe cancelar el valor de $%.2f\n"
                ,nombre,cedula,valor);

    }
    public static void calcularprecio() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cedula;
        String nombre;
        double inmueble;
        double valor;
        System.out.println("Ingrese su nombre COMPLETO: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su numero de cedula: ");
        cedula = entrada.nextLine();
        System.out.println("Ingrese el valor del inmueble: ");
        inmueble = entrada.nextDouble();
        valor = inmueble * 0.2;
        System.out.printf("Cliente %s con cedula %s tiene un bien inmueble valorado en $%.2f\n" +
                          "y tiene que pagar de precio $%.2f\n"
                ,nombre,cedula,inmueble,valor);
        
    }
}
