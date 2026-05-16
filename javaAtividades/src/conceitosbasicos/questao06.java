package conceitosbasicos;
import java.util.Scanner;

public class questao06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o ano do seu nascimento: ");
        int anoNascimento = scan.nextInt();
        int idade = 2026 - anoNascimento;
        System.out.println("Sua idade é: " + idade);
        scan.close();
    }

}
