package estruturadedecisao;
import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite um numero");
        int numero1 = scan.nextInt();
        System.out.println("Digite um numero");
        int numero2 = scan.nextInt();
        if (numero1 > numero2){
            System.out.println("numero 1 é maior ");

        }
        else if (numero2>numero1){
            System.out.println("numero 2 é maior");
        }
        else{
            System.out.println("São iguais.");
        }
        scan.close();
        




    }

}
