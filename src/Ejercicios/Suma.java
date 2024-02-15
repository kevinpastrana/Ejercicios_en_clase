package Ejercicios;

import java.util.Scanner; // Importar una clase

public class Suma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingresa un numero: ");
        num1 = in.nextInt();
        System.out.println("Ingresa otro numero: ");
        num2 = in.nextInt();
        System.out.println("La suma de los dos numeros es de: "+(num1 + num2));
    }
}
