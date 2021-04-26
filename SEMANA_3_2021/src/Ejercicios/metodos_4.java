package Ejercicios;
/**
 *
 * @author Matheo
 */
public class metodos_4 {
    long Nit;
    String Apellidos, Direccion, Nombres;
    double SalarioDevengado, SalarioConDescuento;
    String banderaEmpleado;

    public long getNit() {
        return Nit;
    }

    public void setNit(long Nit) {
        this.Nit = Nit;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public double getSalarioDevengado() {
        return SalarioDevengado;
    }

    public void setSalarioDevengado(double SalarioDevengado) {
        this.SalarioDevengado = SalarioDevengado;
    }

    public double getSalarioConDescuento() {
        return SalarioConDescuento;
    }

    public void setSalarioConDescuento(double SalarioConDescuento) {
        this.SalarioConDescuento = SalarioConDescuento;
    }

    public String getBanderaEmpleado() {
        return banderaEmpleado;
    }

    public void setBanderaEmpleado(String banderaEmpleado) {
        this.banderaEmpleado = banderaEmpleado;
    }

    //metodo para calcular salario devengado
    public void calcularSalasioD (){
        this.setSalarioDevengado(this.getSalarioConDescuento()-this.getSalarioConDescuento()*0.10);
    }

    private double setSalarioDevengado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
