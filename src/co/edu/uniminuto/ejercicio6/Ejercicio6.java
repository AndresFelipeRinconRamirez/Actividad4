package co.edu.uniminuto.ejercicio6;

import co.edu.uniminuto.entity.Transacciones;
import co.edu.uniminuto.entity.alcanciaDigital;
import java.util.List;
import javax.swing.JOptionPane;

public class Ejercicio6 {

    /**
     * 6. Crear un programa que permita simular una alcancía digital. La
     * alcancía permite gestionar el ingreso de monedas, el usuario en todo
     * momento puede consultar la cantidad de dinero que posee y la cantidad de
     * transacciones de ingreso y egreso de dinero y cantidad de dinero en cada
     * transacción.
     */
    public static void main(String[] args) {
        alcanciaDigital alcancia = new alcanciaDigital();
        String opcion;
        String montoAgregar;
        String montoSacar;
        double monto;
        do {
            opcion = JOptionPane.showInputDialog(null,
                    "Alcancía Digital\n"
                    + "1. Ingresar dinero\n"
                    + "2. sacar dinero\n"
                    + "3. Consultar saldo\n"
                    + "4. Consultar transacciones\n"
                    + "5. Salir\n"
                    + "Seleccione una opción:");
            switch (opcion) {
                case "1":
                    montoAgregar = JOptionPane.showInputDialog(null, "Ingrese el monto a agregar:");
                    if (montoAgregar != null) {
                        try {
                            monto = Double.parseDouble(montoAgregar);
                            alcancia.ingresarDinero(monto);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Monto inválido. Por favor, ingrese un valor numerico.");
                        }
                    }
                    break;
                case "2":
                    montoSacar = JOptionPane.showInputDialog(null, "Ingrese el monto que desea sacar :");
                    if (montoSacar != null) {
                        try {
                            monto = Double.parseDouble(montoSacar);
                            alcancia.Egresos(monto);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Monto inválido. Por favor, ingrese un valor numerico.");
                        }
                    }
                    break;
                case "3":
                    alcancia.consultarSaldo();
                    break;
                case "4":
                    alcancia.consultarTransacciones();
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
            }
        } while (!"5".equals(opcion));

    }

}
