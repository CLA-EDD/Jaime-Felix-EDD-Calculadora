package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Calculadora c = new Calculadora();

        System.out.println("Calculadora aritmetica");
        System.out.println("======================");

        System.out.print("Introduce el primer operando:");
        int x = entrada.nextInt();
        
        System.out.println(x+"+"+y+"="+c.sumar(x, y));
        
        entrada.close();
    }
}