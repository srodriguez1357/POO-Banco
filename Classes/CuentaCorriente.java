package Classes;

public class CuentaCorriente extends Cuenta{
    private int transacciones = 0;
    private int importePorTransaccion = 0;
    private int transExetentas = 0;

    public CuentaCorriente(){

    }

    public CuentaCorriente(int transacciones, int importePorTransaccion, int transExtentas) {
        this.transacciones = transacciones;
        this.importePorTransaccion = importePorTransaccion;
        this.transExetentas = transExtentas;
    }

    public CuentaCorriente(String nombre, String cuenta, double saldo, double tipoDeInteres, int transacciones, int importePorTransaccion, int transExtentas) {
        super(nombre, cuenta, saldo, tipoDeInteres);
        this.transacciones = transacciones;
        this.importePorTransaccion = importePorTransaccion;
        this.transExetentas = transExtentas;
    }

    public int getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(int transacciones) {
        this.transacciones = transacciones;
    }

    public int getImportePorTransaccion() {
        return importePorTransaccion;
    }

    public void setImportePorTransaccion(int importePorTransaccion) {
        this.importePorTransaccion = importePorTransaccion;
    }

    public int getTransExtentas() {
        return transExetentas;
    }

    public void setTransExtentas(int transExtentas) {
        this.transExetentas = transExtentas;
    }

    public void deposito(){

    }

    @Override
    public void comisiones(){

    }

    @Override
    public void intereses(){
        this.saldo=saldo*(this.tipoDeInteres/12);
    }
}

