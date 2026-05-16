package conceitosbasicos;
import java.util.Scanner; 

public class questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int a = scan.nextInt();
        float numerofloat = (float) a;
        System.out.println("O número em float é: " + numerofloat);
        scan.close();
    }

}
