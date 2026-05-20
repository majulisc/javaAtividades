package estruturadedecisao;
import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner (System.in);
    System.out.println("Digite sua nota 1:");
    int nota1 = scan.nextInt();
    System.out.println("Digite sua nota 2:");
    int nota2 = scan.nextInt();
    System.out.println("Digite sua nota 3:");
    int nota3 = scan.nextInt();
    int media = (nota1+nota2+nota3)/3;
    System.out.println("Sua média é: "+ media);
    scan.close();

    }



}
