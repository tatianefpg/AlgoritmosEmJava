package operacaoMatematica;
import java.util.Scanner;
/**
 *
 * @author Tatiane Paz
 */
public class OperacoesMatematica {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        byte opcao =1;
        
        do{
            System.out.println("************");
            System.out.println("0 - Sair");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.print("Opção: ");
            opcao = teclado.nextByte();
            System.out.println("************");
            
            if(opcao == 1){
                float x, y, soma;
                System.out.print("\nDigite um valor para x:");
                x = teclado.nextFloat();
                System.out.print("Digite um valor para y:");
                y = teclado.nextFloat();
                soma = x+y;
                System.out.println("A soma de: "+x+" + "+y+" = "+soma);
            }else if(opcao == 2){
                float x, y, subtracao;
                System.out.print("\nDigite um valor para x:");
                x = teclado.nextFloat();
                System.out.print("Digite um valor para y:");
                y = teclado.nextFloat();
                if((x>y)||(x==y)){
                    subtracao = x-y;
                    System.out.println("A subtração de: "+x+" - "+y+" = "+subtracao);
                }else{
                    System.out.println("Subtração inválida!!");
                }
            }else if(opcao == 3){
                float x, y, multiplicacao;
                System.out.print("\nDigite um valor para x:");
                x = teclado.nextFloat();
                System.out.print("Digite um valor para y:");
                y = teclado.nextFloat();
                if((x>=0)&&(y>=0)){
                    multiplicacao = x*y;
                    System.out.println("A multiplicacao de: "+x+" * "+y+" = "+multiplicacao);
                }else{
                    System.out.println("Multiplicação inválida!!");
                }
            }else if(opcao == 4){
                float x, y, divisao;
                System.out.print("\nDigite um valor para x:");
                x = teclado.nextFloat();
                System.out.print("Digite um valor para y:");
                y = teclado.nextFloat();
                if((x>0)&&(y>0)){
                    divisao = x/y;
                    System.out.println("A divisao de: "+x+" / "+y+" = "+divisao);
                }else{
                    System.out.println("Divisão inválida!!");
                }
            }
            System.out.println("");
            
        }while((opcao != 0 ) &&(opcao<=4));
        
        
    }
}
