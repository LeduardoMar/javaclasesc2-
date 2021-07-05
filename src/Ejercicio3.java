import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
            
        

        //Objetivo, requerimiento o problema a solucionar:
        //lee un número entero por teclado y obtiene y 
        //muestra por pantalla el doble y el triple de ese número.
        
        //Algoritmo o pasos a seguir:
        //1) Leer el número entero por teclado
        //2) Obtener el doble del número
        //3) Obtener el triple del número
        //4)Presentar resultados en pantalla

        //Traducción a JAVA

        //1) Leer el núemro entero
        //-> Declarar la variable a que va a contener el número
        //-> Instanciar el objeto que me permite hacer la lectura
        //-> Realizar la lectura

        int numero = 0;
        Scanner lector = new Scanner(System.in); //var lector ... Marco hace esto = new Scaner: Se infiere la variable por lo que hay en la derecha
        System.out.println("Ingrese el número:");
        numero = lector.nextInt();

        //2) Obtener el doble del número
        int doble = numero * 2;

        //3) Obtener el triple del número
        int triple = numero * 3;

        //4)Presentar resultados en pantalla
        System.out.println("EL doble es "+doble+". El triple es "+triple+".");

    }
}

/*
R/
Ingrese el número:
4
EL doble es 8 El triple es 12
*/
