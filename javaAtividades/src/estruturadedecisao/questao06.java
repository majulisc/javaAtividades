package estruturadedecisao;
import java.util.Scanner;

public class questao06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome1 = scan.nextLine();
        System.out.println("Digite seu nome:");
        String nome2 = scan.nextLine();
        if (nome1.length() > nome2.length()){
            System.out.println("Nome 2 é maior");
         }
        else if (nome2.length() < nome1.length()){
            System.out.println("Nome 1 é maior");
           
        }
        else {
            System.out.println("O tamanho é igual");
        }
        scan.close();

       

    }

}
