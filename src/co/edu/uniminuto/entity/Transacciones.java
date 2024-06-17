
package co.edu.uniminuto.entity;


public class Transacciones {
    private String metodo;
    private double monto;

    public Transacciones(String metodo, double monto) {
        this.metodo = metodo;
        this.monto = monto;
    }

    public String getTipo() {
        return metodo;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "metodo: " + metodo + ", Monto: " + monto;
    }
    
    
}
