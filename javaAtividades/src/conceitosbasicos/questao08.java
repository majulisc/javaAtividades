package conceitosbasicos;
import java.util.Scanner;

public class questao08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma sequencia de numeros separados por espaço ex: 1 2 3 ...");
        String input = scan.nextLine();
        String[] numeros = input.split(" ");
        int quantidadeNumeros = numeros.length;
        System.out.println("Foram digitados: " + quantidadeNumeros);
        scan.close();


    }

}
