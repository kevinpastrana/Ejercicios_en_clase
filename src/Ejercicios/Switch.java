package Ejercicios;

// Escriba un algoritmo que permita mostrar la equivalencia en número decimal de los números romanos (I,V,X,L,C,D,M).

import javax.swing.*;

public class Switch {

    public static void main(String args[]) {

        char x;

        x = JOptionPane.showInputDialog("Digite algunos de los siguientes números romanos [I,V,X,L,C,D,M]: ").charAt(0);
        // Al final se le pone .charAt(0) para tomar el primer valor que digite el usuario en teclado.

        x -= 32; // Esto convierte la letra en mayuscula (por si el usuario lo escribe en minuscula...). De mayuscula a minuscula se suma 32.

        switch (x) {
            case 'I':
                JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 1");
                break;
            case 'V':
                JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 5");

                break;
            case 'X':
                JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 10");

                break;
            case 'L':
                JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 50");

                break;
            case 'C':
                JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 50");

                break;
            case 'D':
                JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 500");

                break;
            case 'M':
                JOptionPane.showMessageDialog(null, "La letra " + x + " corresponde al número 1000");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Error: Digite I,V,X,L,C,D,M ");

        }// Fin del switch
    }
}// Fin del programa
