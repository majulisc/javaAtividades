package estruturadedecisao;
import java.util.Scanner;
public class questao07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite caracter: ");
        char caracter = scan.next().charAt(0);
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
            System.out.println("é vogal");
        }
       
        else{
            System.out.println("é consoante");
        }
        scan.close();
    }


}
