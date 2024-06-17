
package co.edu.uniminuto.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class alcanciaDigital {
    private double saldo;
    private ArrayList<Transacciones> transacciones;
    double monto;

    public alcanciaDigital() {
        this.saldo = 0.0;
        this.transacciones = new ArrayList<>();
    }
    public void ingresarDinero(double monto) {
        if (monto > 0) {
            saldo += monto;
            transacciones.add(new Transacciones("Ingreso", monto));
            JOptionPane.showMessageDialog(null, "Se han ingresado " + monto + " a la alcancía.");
        } else {
            JOptionPane.showMessageDialog(null, "El monto debe ser mayor a cero.");
        }
    
    }
    public void Egresos (double monto){
        if (monto > 0) {
            saldo -= monto;
            transacciones.add(new Transacciones("Egreso", monto));
            JOptionPane.showMessageDialog(null, "Se han retirado " + monto + " de la alcancía.");
        } else {
            JOptionPane.showMessageDialog(null, "El monto debe ser mayor a cero.");
        }
    }
    
    public void consultarSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo actual: " + saldo);
    }

    public void consultarTransacciones() {
        StringBuilder detalles = new StringBuilder();
        for (int i = 0; i < transacciones.size(); i++) {
            detalles.append("Transacción ").append(i + 1).append(": ").append(transacciones.get(i)).append("\n");
        }
        JOptionPane.showMessageDialog(null, detalles.toString());
    }
    }
    

