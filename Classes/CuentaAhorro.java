package Classes;

public class CuentaAhorro extends Cuenta{
    private double cuotaMantenimiento = 40.0;

    public CuentaAhorro(){

    }

    public CuentaAhorro(double cuotaMantenimiento) {
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    public CuentaAhorro(String nombre, String cuenta, double saldo, double tipoDeInteres, double cuotaMantenimiento) {
        super(nombre, cuenta, saldo, tipoDeInteres);
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    public double getCuotaMantenimiento() {
        return cuotaMantenimiento;
    }

    public void setCuotaMantenimiento(double cuotaMantenimiento) {
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    @Override
    public void comisiones(){
        this.saldo-=cuotaMantenimiento;
    }

    @Override
    public void intereses(){
        this.saldo=saldo*(this.tipoDeInteres/12);
    }
}
