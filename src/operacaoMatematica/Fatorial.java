package operacaoMatematica;
import java.util.Scanner;

/**
 *
 * @author Tatiane Paz
 */

public class Fatorial {
    public static void main(String[] args) {
        int fator;
        int resultado = 1;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Dgite o número para fatorar: ");
        fator = teclado.nextInt();
        for(int i = fator; i>1; i--){
            resultado *= i;
        }
        System.out.println("O fatorial de "+fator+" é: "+resultado);
        
    }
}
