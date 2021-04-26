package Ejercicios;

import java.util.Scanner;

public class Empleado_Ejercicio_4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        metodos_4 empleado = new metodos_4();
        
        System.out.println("Igrese el numero del Nit: ");
        long nit = Long.parseLong(leer.nextLine());
        empleado.setNit(nit);
        
        System.out.println("Ingrese su nombres: ");
        String nombre = leer.nextLine();
        empleado.setNombres(nombre);
        
        System.out.println("Ingrese apellidos: ");
        String apellidos = leer.nextLine();
        empleado.setApellidos(apellidos);
        
        System.out.println("Ingrese su direccion: ");
        String Direccion = leer.nextLine();
        empleado.setDireccion(Direccion);
        
        System.out.println("Ingrese salario devengado: ");
        double salarioD = leer.nextDouble();
        empleado.setSalarioConDescuento(salarioD);
        
        System.out.println("Ingrese bandera: ");
        String bandera = leer.next();
        empleado.setBanderaEmpleado(bandera);

        empleado.calcularSalasioD();
        
        System.out.println("\n-------------------");
        System.out.println("Los datos del empleado son: ");
        System.out.println("Numero de NIT: " + empleado.getNit());
        System.out.println("Nombre: " + empleado.getNombres() + empleado.getApellidos());
        System.out.println("Direccion: " + empleado.getDireccion());
        System.out.println("Salario devengado: " + empleado.getSalarioDevengado());
        System.out.println("Salario total: " + empleado.getSalarioConDescuento());
        System.out.println("Bandera del empleado: " + empleado.getBanderaEmpleado());
        
        
    }
    
}
