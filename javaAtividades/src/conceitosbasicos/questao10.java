package conceitosbasicos;
import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scan.nextLine();
        System.out.println(sobrenome + " " + nome);
        scan.close();


    
    }

}
