package Classes;

import java.awt.*;

public abstract class Cuenta {
    private String nombre = "Desconocido";
    private String cuenta = "12345";
    public double saldo = 0.0;
    public double tipoDeInteres = 0.0;

    public Cuenta(){

    }

    public Cuenta(String nombre, String cuenta, double saldo, double tipoDeInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoDeInteres = tipoDeInteres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoDeInteres() {
        return tipoDeInteres;
    }

    public void setTipoDeInteres(double tipoDeInteres) {
        this.tipoDeInteres = tipoDeInteres;
    }

    public void deposito(double cantidad){
        if(cantidad>0){
            this.saldo += cantidad;
            System.out.println("Transferencia realizada con éxito");
        }
        else{
            System.out.println("Cantidad Inválida, Imposible realizar la Transferencia");
        }

    }

    public void retiro(double cantidad){
        if(cantidad>0){
            if((this.saldo-cantidad)>=0){
                saldo-=cantidad;
                System.out.println("Retiro realizado con éxito");
            }
        }
        else{
            System.out.println("Ingrese una cifra válida para retirar");
        }
    }

    public abstract void comisiones();
    public abstract void intereses();

}
