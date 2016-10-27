package imc;
import java.util.Scanner;
/**
 *
 * @author Tatiane Paz
 */
public class IMC {
    /*
    *imc = peso/altura²;
    */
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        float peso, altura;
        
        System.out.print("Digite o valor do seu peso: ");
        peso = leitura.nextFloat();
        System.out.print("Digite o valor da sua altura: ");
        altura = leitura.nextFloat();
        
        float imc;
        altura = altura*altura;
        imc = peso/altura;
        
        System.out.println("O imc é: "+imc);
        
            
            
    }
}
   
