package Ejercicios;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Casa_Ejercicio1 {
    public static void main(String[] args) {
        datosCasa_1 casa =  new datosCasa_1();
        BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
        String numeroCasa;
        double numeroPasaje;
        String nombreCalle;
        try {
        System.out.println("Escriba el numero de casa: ");
        numeroCasa = leer.readLine();
        System.out.println("Escriba el numero del pasaje: ");
        numeroPasaje = Double.parseDouble(leer.readLine());
        System.out.println("Escriba el nombre de la calle");
        nombreCalle = leer.readLine();
        
        casa.setNumeroCasa(numeroCasa);
        casa.setNumeroPasaje(numeroPasaje);
        casa.setNombreCalle(nombreCalle);
        
            System.out.println("Numero de la casa: " + casa.getNumeroCasa());
            System.out.println("Numero de pasaje: " + casa.getNumeroPasaje());
            System.out.println("Nombre de la calle: " + casa.getNombreCalle());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
