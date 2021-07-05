import java.util.*;

public class Ejercicio5 {

    //Requerimiento:
    //Determinar si el valor ingresado es par o impar y retornar en consola

    public static boolean esPar(int numero){

        if(numero % 2 == 0){
            return true;
        }else{
            return false;
        }
    }  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt(); //Recoge un número entero

        //Lógica (Algoritmo)
        if(esPar(numero)){
            //Reportar en pantalla
            System.out.println("El número "+numero+" es par");
        }else{
            //Reportar en pantalla
            System.out.println("El número "+numero+" es impar");
        }
    }  
}

/*
Ingrese un número: 
5
El número 5 es impar
*/