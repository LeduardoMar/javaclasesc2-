import java.util.*;  //Como no estmos en maven, se importan todas las utilidades (*) 

public class Ejercicio2 {
   
    //Requerimiento:
   //Implemente un algoritmo que reciba un número por
   //teclado y cuente cuántas cifras (o dígitos)
   //contiene e imprima el mensaje en consola. 

    public static int numeroCifras(int numero){
        //Declarar la variable que acumula el número de cifras
        int numCifras = 0; //costumbre de inicializar

        //Procedimiento
        //145 Dicisión flotante -> 14.5
        //  DIvisión entera(tipos) ->14 -> 1 -> 0

        // Mientras sea diferente de cero, realizar dicvisiones sucesivas 
        //Y por cada división que se realiza incrementar el acumulador
        while( numero != 0){
            //numCifras = numCifras / 10; //Versión genérica de actualización
            numero /= 10; //Versión resumida

            //cada vez que divide acumula una cifra/ Incremento y acumulo
            // numCifras = numCifras + 1;
            // numCifras += 1; 
            numCifras++;
            //++numCifras;
        }


        //Retornar lo que quede en el acumulador
        return numCifras;
    }
    public static void main(String[] args) {

        //Recolección en python
        //numero = int(input('Ingrese un número'))

        //scaner es el elemento que recoje la info el "input"
        //Va el elemento y el nombre en minuscula = y diaologo con el SO:
        //Recolección del número por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();

        //Lógica (Algoritmo)
        int numeroCifras = numeroCifras(numero);

        //Reportar en pantalla
        System.out.println("El número de cifras es: "+numeroCifras);
    

        //No es necesario cierre para versiones relativamente recientes
        //No lo recomienda mucho porque lo hace automático
        sc.close();
}

}


/*
R/
Ingrese un número: 
345
El número de cifras es: 3
*/
