package conceitosbasicos;
import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(scan.nextLine());
        System.out.println("Sua idade é: " + idade);
        scan.close();


        
    }

}
