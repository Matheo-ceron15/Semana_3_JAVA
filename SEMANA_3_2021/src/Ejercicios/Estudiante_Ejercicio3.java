package Ejercicios;

import java.util.Scanner;

public class Estudiante_Ejercicio3 {
        public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        
        int carnet = 0, codCarrera = 0;
        String nombre;
        int cantidad = 1;
        while (cantidad<=5){
            System.out.println("Esriba el numero de carnet: " + cantidad);
            carnet = leer.nextInt();

            System.out.println("Escriba su nombre: " + cantidad);
            nombre  = leer.next();

            System.out.println("Escriba el codigo de la carrera: " + cantidad);
            codCarrera = leer.nextInt();

            HashTable_3 datos= new HashTable_3(carnet, nombre, codCarrera);
            datos.carnet= carnet;
            datos.nombre=nombre;
            datos.codCarrera = codCarrera;

            System.out.println("El carnet del estudiante es: " + datos.carnet);
            System.out.println("El nombre del estudiante es: " + datos.nombre);
            System.out.println("El codigo de la carrera es: " + datos.codCarrera);
            System.out.println("-------------------------------------\n");
            
            cantidad=cantidad+1;
        }


    }
}
