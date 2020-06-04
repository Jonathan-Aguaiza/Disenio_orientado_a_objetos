/*
Ingresar por teclado un objeto un del mundo real y convertirlo a mundo
informatico, finalmente presentarlos en pantalla
 */
package diseñoorientadoaobjetos;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
import java.util.Scanner;
public class DiseñoOrientadoaObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);
                //new, reserva espacio de memoria
        
        System.out.println("Ingrese un objeto del mundo real:");
        String r1=objeto.nextLine();
        /*
        motor
        */
        System.out.println("Ingrese primer atributo:");
        String atr1=objeto.nextLine();
        /*
        marca
        */
        System.out.println("Ingrese segundo atributo:");
        String atr2=objeto.nextLine();
        /*
        potencia
        */
        System.out.println("Ingrese tercer atributo:");
        String atr3=objeto.nextLine();
        /*
        cilindraje
        */
        System.out.println("Ingrese el primer servicio:");
        String ser1=objeto.nextLine();
        /*
        motor mclaren 720
        */
        System.out.println("Ingrese el segundo servicio:");
        String ser2=objeto.nextLine();
        /*
        720 caballos de fuerza
        */
        System.out.println("Ingrese el tercer servicio:");
        String ser3=objeto.nextLine();
        /*
        motor 8 en V
        */
        
        System.out.println("            UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("NOMBRE: AGUAIZA JONATHAN                   Carrera: Ing Automotriz");
        
        System.out.println("Ingrese un objeto real:");
        System.out.println(""+r1);
        System.out.println("");
        System.out.println("Convertir dicho objeto en uno informatico:");
        System.out.println("Atributos");
        System.out.println("1.-"+atr1);
        System.out.println("2.-"+atr2);
        System.out.println("3.-"+atr3);
        System.out.println("");
        System.out.println("Servicio:");
        System.out.println("1.- Reconocer la marca:");
        System.out.println(""+ser1);
        System.out.println("2.- Determinar la Potencia");
        System.out.println(""+ser2);
        System.out.println("3.- Describir el cilindraje");
        System.out.println("3.-"+ser3);
    }
    
}
