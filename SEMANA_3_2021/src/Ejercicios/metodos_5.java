package Ejercicios;

import java.text.DecimalFormat;

public class metodos_5 {
    private int NumCuenta;
    private int LecturaActualmedidor;
    private int LecturaAnteriormedidor;
    private int Multiplicador;
    private double ConsumoMensual;
    private int ConsumoDiario;
    private double ValorFactura;

    DecimalFormat format=new DecimalFormat("#0.00");

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public int getLecturaActualmedidor() {
        return LecturaActualmedidor;
    }

    public void setLecturaActualmedidor(int LecturaActualmedidor) {
        this.LecturaActualmedidor = LecturaActualmedidor;
    }

    public int getLecturaAnteriormedidor() {
        return LecturaAnteriormedidor;
    }

    public void setLecturaAnteriormedidor(int LecturaAnteriormedidor) {
        this.LecturaAnteriormedidor = LecturaAnteriormedidor;
    }

    public int getMultiplicador() {
        return Multiplicador;
    }

    public void setMultiplicador(int Multiplicador) {
        this.Multiplicador = Multiplicador;
    }

    public double getConsumoMensual() {
        return ConsumoMensual;
    }

    public void setConsumoMensual(double ConsumoMensual) {
        this.ConsumoMensual = ConsumoMensual;
    }

    public int getConsumoDiario() {
        return ConsumoDiario;
    }

    public void setConsumoDiario(int ConsumoDiario) {
        this.ConsumoDiario = ConsumoDiario;
    }

    public double getValorFactura() {
        return ValorFactura;
    }

    public void setValorFactura(double ValorFactura) {
        this.ValorFactura = ValorFactura;
    }

    public DecimalFormat getFormat() {
        return format;
    }

    public void setFormat(DecimalFormat format) {
        this.format = format;
    }



    
    
    //metodo consumo mes
    public void calculoMes(){
        this.ConsumoMensual= (this.getLecturaActualmedidor() - this.getLecturaAnteriormedidor())* this.getMultiplicador();
    }
    //comsumo diario
    public void calculoDiario(){
        this.ConsumoDiario=((this.getLecturaActualmedidor()-this.getLecturaAnteriormedidor())*this.getMultiplicador())/30;
    }
    //valor de la factura
    public void calcularValorFactura(){
                double consumo = (this.getLecturaActualmedidor() - this.getLecturaAnteriormedidor() )* this.getMultiplicador();
                this.setValorFactura(consumo * 0.20);
    }

    
}
