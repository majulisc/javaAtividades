package conceitosbasicos;

import java.util.Scanner;


public class questao07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite seu primeiro nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite seu seu sobrenome: ");
        String sobrenome = scan.nextLine();
        System.out.println("Seu nome completo é: " + nome + " " + sobrenome );
        scan.close();
    }

}
