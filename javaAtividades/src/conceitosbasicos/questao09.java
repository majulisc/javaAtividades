package conceitosbasicos;
import java.util.Scanner;

public class questao09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do seu animal: ");
        String animal = scan.nextLine();
        System.out.println("O nome do seu animal é: " + animal);
        scan.close();
    }

}
