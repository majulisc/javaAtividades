package conceitosbasicos;

import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois numeros inteiros: ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int x = numero1 + numero2;

        System.err.println("A soma dos numeros é = " + x);
        scan.close();




    }
    



}
