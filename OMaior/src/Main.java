import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor1 = input.nextInt();
        int valor2 = input.nextInt();
        int valor3 = input.nextInt();
        if (valor1 > valor2 && valor1 > valor3) {
            System.out.println(valor1 + " eh o maior");
        } else if (valor2 > valor3) {
            System.out.println(valor2 + " eh o maior");
        } else {
            System.out.println(valor3 + " eh o maior");
        }
    }
}