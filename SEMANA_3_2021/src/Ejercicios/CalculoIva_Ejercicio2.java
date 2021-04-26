package Ejercicios;

import java.util.Scanner;

public class CalculoIva_Ejercicio2 {
        public static void main(String[] args) {
            Scanner leer =  new Scanner (System.in);
        double precioP, iva = 0;

            System.out.println("Escriba el porcentaje del IVA del producto:     ");
            iva = leer.nextDouble();
            System.out.println("Escriba el precio del producto sin IVA: ");
            precioP = leer.nextDouble();
            
            double metodo1 = calcularIva(iva, precioP);
            double metodo2 = parametro(metodo1, iva, precioP);
            System.out.println("El precio del producto con iva es  de: $" + metodo1);
            System.out.println("eL IVA aplicado es de: %" + iva);
            System.out.println("El precio del producto si iva es de: " + metodo2);
    }
        //metodo 1
    public static double calcularIva (double iva, double precioP){
        double calculoIva = iva/100;
        double iva1= calculoIva * precioP;
        double ivaTotal = precioP + iva1;
    return ivaTotal;
    }
    //metodo 2
    public static double parametro (double metodo1, double iva, double precioP){
        double precio  = precioP;
    return precio;
    }
}
