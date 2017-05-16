

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        int num1=33;
        int num2=248;
        char a=0;
        //establezco una secuencia de diez números aleatorios
        //podemos establecer la secuencia que queramos, siempre y cuando recordemos que el alfabeto en acssi tiene 26 letras, aí que ese es el máximo de la secuencia
        for (int i = 1; i <= 2; i++) {
            int numAleatorio = (int) Math.floor(Math.random() * (num2 - num1) + num1);
            System.out.println("la letra generada es: " + (char) numAleatorio);
            System.out.println("el numero generado es: "+ numAleatorio);
            a++;
            Scanner in = new Scanner(System.in);
        }
    }
}