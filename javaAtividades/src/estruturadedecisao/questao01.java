package estruturadedecisao;
import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scan.nextInt();
        if(numero>0){
            System.out.println("é positivo");

        }
        else if (numero ==0){
            System.out.println("é 0");
        }
        else {
            System.out.println("é negativo");
        }
        scan.close();

        


       
            
    }

}
