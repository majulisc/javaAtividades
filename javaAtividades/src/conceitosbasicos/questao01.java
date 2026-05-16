package conceitosbasicos;

import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite seu nome: ");
    String nome = scan.nextLine();
    System.out.print(" Bem vindo " + nome + " !");
    scan.close();

    }
    
}
