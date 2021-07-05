public class Ejercicio1 {
 
    //    def saludo(nombre):
    //        cadenaSaludo = 'Hola' + nombre 
    //        return cadenaSaludo
    /*

    comentario de varias líneas
    Activar y desactivar con comand + shif + 7

    */
    // Traducción a Java
    //acceso a ella + el tipo de parametro y lo que retorna (también definido)
    public static String saludo(String nombre){    //toca nombrar lo que llega (string)
        String cadenaSaludo = "Hola "+ nombre;  //punto y coma siempre para cambiar o cerrar línea
        return cadenaSaludo;    
    }

    // Sección principal     (run= main es auto)
    public static void main(String[] args) {
        
        String nombre = "Tripulante Misión TIC2022";
        String cadenaSaludoCompleto = saludo(nombre);
        System.out.println(cadenaSaludoCompleto);   // = sysout
    }
    
}

//R/  Hola Tripulante Misión TIC2022

