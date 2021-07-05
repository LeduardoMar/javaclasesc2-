import java.util.Scanner;

public class Ejercicio3V2 {

    //Lógica -> 

    //Función o método que calcula el doble
    //-alcance - qué debuelve (la salida) - qué recibe y tipo dato
    public static int doble(int numero){
        int doble = 0;
        doble = numero * 2;
        return doble;
    }
    public static int triple(int numero){
        int triple = 0; 
        triple = numero * 3;
        return triple;
    }

    //Interacción ->

    //Bien venida y Saludo al usuario:
    public static void saludo(){
        //Bienvenida
        System.out.println("Bienvenido al Ejetcicio 3!!");

        //Recoger el nombre para generar el saludo
        Scanner sc = new Scanner(System.in);  //System in es la entrada.
        System.out.println("Ingresar el nombre: ");
        String nombre = sc.nextLine();

        //Presentar el saludo
        System.out.println("Hola " +nombre+ " pendejete!");
    }
    //Lectura dle número que se va a procesar
    public static int leerNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese número: ");
        int numero = sc.nextInt();
        return numero;
    }
    //Reportar resultado
    public static void reportarResultado(int doble, int triple){
        System.out.println("EL doble es "+doble+". El triple es "+triple+".");

    }
 
    public static void main(String[] args) {

        //0) Saludo (al separar lógica de interacción) 
        saludo();

        //Antes de modulatizar (métodos)
        //int numero = 0;
        // Scanner lector = new Scanner(System.in); //var lector ... Marco hace esto = new Scaner: Se infiere la variable por lo que hay en la derecha
        // System.out.println("Ingrese el número:");
        // numero = lector.nextInt();

        //Modularizado
        int numero = leerNumero();

        //2) Obtener el doble del número
        int doble = doble(numero);

        //3) Obtener el triple del número
        int triple = triple(numero);

        //4)Presentar resultados en pantalla
        //System.out.println("EL doble es "+doble+". El triple es "+triple+".");
        reportarResultado(doble, triple); 
    }
}

/*
R/
Ingresar el nombre: 
Eduardo
Hola Eduardo pendejete!
Ingrese número: 
35
EL doble es 70. El triple es 105.
eduardomar@iMac-de-Eduardo primerProyectoEjercicios %
*/