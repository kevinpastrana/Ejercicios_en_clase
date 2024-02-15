package Ejercicios;

import java.util.Scanner; // Importar una clase

public class Nombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Hola "+nombre+" Bienvenido a NetBeans");
    }
}
