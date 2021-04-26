package Ejercicios;

public class metodos_6 {
    private String fecha;

   public String ConvertirFechaGuion() {
        String r = "";
        for (int i = 0; i <= 2; i++) {
            r+=fecha.substring(i,i+2)+"-";
            i++;
        }
        r+=fecha.substring(4,8);
        return r;
    }

    public String ConvertirFechaFlecas() {
        String r = "";
        for (int i = 0; i <= 2; i++) {
            r+=fecha.substring(i,i+2)+"/"; 
            i++;
        }
        r+=fecha.substring(4,8);
        return r;  
    }

    public void setFecha(int fecha) {
        this.fecha = String.valueOf(fecha);
    }

    public String getFecha() {
        return this.fecha;
    }
    
    }
