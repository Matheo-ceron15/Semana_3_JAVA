package Ejercicios;

import java.util.Scanner;

public class factura_electrica_ejercicio5 {
    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        int numCuenta, lecturaAnterior, lecturaActual, multiplicador;
        System.out.println("Ingrese numero de cuenta: ");
        numCuenta = leer.nextInt();
        
        System.out.println("Ingrese lectura anterior de la factura: ");
        lecturaAnterior = leer.nextInt();
        
        System.out.println("Ingrese lectura actal de la factura: ");
        lecturaActual =  leer.nextInt();
        
        System.out.println("Ingrese el multiplicador: ");
        multiplicador = leer.nextInt();
        
        //metodo de recoleccion de datos
        metodos_5 factura =  new metodos_5();
        factura.setNumCuenta(numCuenta);
        factura.setLecturaActualmedidor(lecturaActual);
        factura.setLecturaAnteriormedidor(lecturaAnterior);
        factura.setMultiplicador(multiplicador);
        
        factura.calculoMes();
        factura.calculoDiario();
        factura.calcularValorFactura();
        
        System.out.println("\n ------------------------");
        System.out.println("Los datos de la factura son:");
        System.out.println("Numero de cuenta: \n" + factura.getNumCuenta());
        System.out.println("Lectura anterior: \n" + factura.getLecturaAnteriormedidor() + " KWH");
        System.out.println("Lectura actual: \n" + factura.getLecturaActualmedidor()+ " KWH");
        System.out.println("Multiplicador \n" + factura.getMultiplicador());
        System.out.println("Consumo diario: \n" + factura.getConsumoDiario()+ " KWH");
        System.out.println("Comsumo mensual: \n" + factura.getConsumoMensual() + " KWH");
        System.out.println("Valor de factura: \n$ " + factura.getValorFactura());
    }
}
