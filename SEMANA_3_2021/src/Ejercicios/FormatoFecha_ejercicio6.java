package Ejercicios;

import java.util.Scanner;

public class FormatoFecha_ejercicio6 {
    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        metodos_6 fecha = new metodos_6();
        int cadenaFecha = 0, m = 0, numEvaluar = 0, cond = 0;
        String cadenaValidar = null;
        int[] CDiasMes = {1, 30, 12, 1000}; //CANTIDAD DE DIAS Y MESES
        do {
            if (cadenaValidar == null) {
                System.out.println("Ingrese una fecha \nFormato 10122020 => DiaMesAño");
                try {
                    fecha.setFecha(cadenaFecha = Integer.parseInt(leer.nextLine()));
                    if (fecha.getFecha().length() == 8) {
                        cadenaValidar = String.valueOf(cadenaFecha);
                    } else {
                        System.out.println("-----------\nIngrese una fecha con formato válido\n---------------\n");
                    }
                } catch (Exception e) {
                    System.out.println("-------------\nIngrese un número entero\n--------------\n");
                }
            } else {
                numEvaluar = Integer.parseInt(cadenaValidar.substring(m, (m + 2)));
                if (numEvaluar >= CDiasMes[0] && numEvaluar <= CDiasMes[(m + 1 - cond)]) {
                    cond++;
                    m += 2;
                    if (cond == 2) {
                        numEvaluar = Integer.parseInt(cadenaValidar.substring(4, 8));
                        if (numEvaluar > 999 && numEvaluar <= 9999) {
                            cond++;
                            
                        } else {
                            System.out.println("\naIngrese el formato valido DiaMesAño\n");
                            cadenaValidar = null;
                        }
                    }
                } else {
                    System.out.println("\nIngrese el formato valido DiaMesAño\n");
                    cadenaValidar = null;
                }
            }
        } while (cond < 3);
        cond=0;
        do{
            System.out.println("\nIngrese opción a convertir fecha\n 1-Con flecas / / /\n 2-Con guiones - - -");
            String opcion=leer.nextLine();
            if(opcion.equals("1")){
            System.out.println(fecha.ConvertirFechaFlecas());
            cond+=1;
            }
            else if(opcion.equals("2")){
                System.out.println(fecha.ConvertirFechaGuion());
                cond+=1;
            }
            else{
                System.out.println("Ingese una de las opciones validas");
            }
        }while(cond!=1);
    }
}
