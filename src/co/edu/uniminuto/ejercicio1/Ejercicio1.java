package co.edu.uniminuto.ejercicio1;

import co.edu.uniminuto.entity.Operacion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Ejercicio1 {

    /*
    1. Crear una calculadora con 8 operaciones 
    matemáticas, se debe presentar un menú con el
nombre de las operaciones (pedir 2 números) y 
    mostrar el resultado. Una vez mostrado el
resultado se debe mostrar otra vez el menú. 
    Hacer validaciones de datos.
     */
    public static void main(String[] args) {
        List<Operacion> listOperaciones = new ArrayList<>();
        Operacion operaciones = new Operacion();
        String menu;
        String validacion;
        double eleccion;
        try {
            do {
                // Mostrar el menú
                menu = JOptionPane.showInputDialog(
                        null,
                        "Operaciones Matemáticas:\n"
                        + "1. Suma\n"
                        + "2. Resta\n"
                        + "3. Multiplicación\n"
                        + "4. División\n"
                        + "5. Valor absoluto \n"
                        + "6. redondeo \n"
                        + "7. Raíz cuadrada \n"
                        + "8. Logaritmo natural\n"
                        + "9. Salir\n"
                        + "Seleccione una opción entre(1-8) para operaciones o (9) para salir: ");
                if (menu == null) {
                    break;
                }
                switch (menu) {
                    case "1":
                        operaciones.leerNumeros();
                        operaciones.Sumar();
                        break;
                    case "2":
                        operaciones.leerNumeros();
                        operaciones.Restar();
                        break;
                    case "3":
                        operaciones.leerNumeros();
                        operaciones.Multiplicar();
                        break;
                    case "4":
                        operaciones.leerNumeros();
                        operaciones.Dividir();
                        break;
                    case "5":
                        operaciones.leerNumeros();
                        operaciones.valorAbsoluto();
                        break;
                    case "6":
                        operaciones.leerNumeros();
                        operaciones.Redondeo();
                        break;
                    case "7":
                        operaciones.leerNumeros();
                        operaciones.Raiz();
                        break;
                    case "8":
                        operaciones.leerNumeros();
                        operaciones.logaritmoNatural();
                        break;
                    case "9":
                        JOptionPane.showMessageDialog(null, "Cerrando el programa");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Inténtelo de nuevo, valor no valido");
                }

            } while (!menu.equals("9"));
        } catch (Exception e) {
            System.out.println("Error en captura de datos:" + e.getMessage());

        }

    }
}
