
package figuraGeometrica;
import java.util.Scanner;

/**
 *
 * @author Tatiane Paz
 */
public class FiguraGeometrica {
     /*
    *Faça um programa em que o usuário possa digitar os lados das figuras, 
    * e como resposta obtenha a área da mesma.
    */ 
    
    public static void main(String[] args) {
        int opcao;
        float area, lado1, lado2; 
        float pi =3.14f;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Deseja calcular a área de qual figura geométrica:");
        System.out.println("1- Quadrado");
        System.out.println("2- Retângulo");
        System.out.println("3- Triângulo");
        System.out.println("4- Círculo");
        System.out.println("5- Losango");
        System.out.print("opção: ");
        opcao = leitura.nextInt();
        
        if(opcao == 1){
                System.out.print("\nDigite o valor do lado do quadrado:");
                lado1 = leitura.nextFloat();
                area = (lado1*lado1);
                System.out.println("A área do quadrado é: "+area);
        }else if(opcao == 2){
                System.out.print("\nDigite o valor da altura do retângulo:");
                lado2 = leitura.nextFloat();
                System.out.print("Digite o valor da largura do retângulo:");
                lado1 = leitura.nextFloat();
                area = (lado1*lado2);
                System.out.println("A área do retângulo é: "+area);
        }else if(opcao == 3){
                System.out.print("\nDigite o valor da altura do triângulo:");
                lado2 = leitura.nextFloat();
                System.out.print("Digite o valor da largura do triângulo:");
                lado1 = leitura.nextFloat();
                area = (lado1*lado2)/2;
                System.out.println("A área do triângulo é: "+area);
        }else if(opcao == 4){
                System.out.print("\nDigite o valor do raio do circulo:");
                lado1 = leitura.nextFloat();
                area = (2*pi*lado1);
                System.out.println("A área do circulo é: "+area);
        }else if(opcao == 5){
                System.out.print("\nDigite o valor do lado do losango:");
                lado1 = leitura.nextFloat();
                System.out.print("Digite o valor do segundo lado do losango:");
                lado2 = leitura.nextFloat();
                area = (lado1*lado2)/2;
                System.out.println("A área do losango é: "+area);
        }
        
    }

}
