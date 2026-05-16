package conceitosbasicos;

import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor decimal");
        float decimal = scan.nextFloat();
        float quadrado = decimal * decimal;
        System.out.println("O quadrado do numero é: " + quadrado);
        scan.close();

}
}
