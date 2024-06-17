
package co.edu.uniminuto.entity;

import javax.swing.JOptionPane;


public class Operacion {
    double numero1;
    double numero2;
    double suma;
    double resta;
    double multiplicacion;
    double division;
    double valorAbsolutoNo1;
    double valorAbsolutoNo2;
    double redondeoNo1;
    double redondeoNo2;
    double raizNo1;
    double raizNo2;
    double logaritmoNaturalNo1;
    double logaritmoNaturalNo2;
// metodos
public void leerNumeros(){
    numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digita el primer numero"));
    numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digita el segundo numero"));
}   
public void Sumar (){
    suma = numero1+numero2;
    JOptionPane.showInputDialog("El resultado de la suma es: "+suma);
}

public void Restar (){
    resta = numero1-numero2;
    JOptionPane.showInputDialog("El resultado de la resta es: "+resta);
}

public void Multiplicar (){
    multiplicacion = numero1*numero2;
    JOptionPane.showInputDialog("El resultado de la multiplicacion es: "+multiplicacion);
}
public void Dividir (){
    division =numero1/numero2;
    JOptionPane.showInputDialog("El resultado de la division es: "+division);
}    
public void valorAbsoluto (){
    valorAbsolutoNo1 = Math.abs(numero1);
    valorAbsolutoNo2 = Math.abs(numero2);
    JOptionPane.showInputDialog("El valor absoluto del numero 1 es: "+valorAbsolutoNo1+" y del numero 2 es: "+valorAbsolutoNo2);
}

public void Redondeo (){
    redondeoNo1 = Math.round(numero1);
    redondeoNo2 = Math.round(numero2);
    JOptionPane.showInputDialog("El resultado del redondeo del numero 1 es: "+redondeoNo1+" y del numero 2 es: "+redondeoNo2);
    
}
public void Raiz (){
    raizNo1 = Math.sqrt(numero1);
    raizNo2 = Math.sqrt(numero2);
    JOptionPane.showInputDialog("El resultado de la raiz cuadrada del numero 1 es: "+raizNo1+" y del numero 2 es: "+raizNo2);
}    

public void logaritmoNatural(){
    logaritmoNaturalNo1 = Math.log(numero1);
    logaritmoNaturalNo2 = Math.log(numero2);
    JOptionPane.showInputDialog("El resultado del logaritmo natural del numero 1 es: "+logaritmoNaturalNo1+" y del numero 2 es: "+logaritmoNaturalNo2);
}
        
}




