import java.util.Scanner;

public class Ejetcicio4_Unidad {
    public static void tablaMultipliacr(int numero){

        //Sabemos el número de veces. Recomiendan usar un for
        //FOR = limiteSuperior, limiteInferior, avnace(En Java siempre devemos definir el avance)
        for(int i = 0; i <= 10; i++){

            //Mostrar cada operación de la tabla de multiplicar
            int valor = numero * i; 
            System.out.println("La tabla es "+ numero + " X " + i + " = " + valor);
        }


    }
    public static void main(String[] args) {
       System.out.println("Ingresar número");
       Scanner sc = new Scanner(System.in);
       tablaMultipliacr(sc.nextInt()); 

    }
}

/*
R/
Ingresar número
4
La tabla es 4 * 0 = 0
La tabla es 4 * 1 = 4
La tabla es 4 * 2 = 8
La tabla es 4 * 3 = 12
La tabla es 4 * 4 = 16
La tabla es 4 * 5 = 20
La tabla es 4 * 6 = 24
La tabla es 4 * 7 = 28
La tabla es 4 * 8 = 32
La tabla es 4 * 9 = 36
La tabla es 4 * 10 = 40
eduardomar@iMac-de-Eduardo primerProyectoEjercicios % 
*/