
package leitorVariaveis;
import java.util.Scanner;
/**
 *
 * @author tatiane
 */
public class LeitorScanner {
    public static void main (String[] args){
        Scanner leitura = new Scanner(System.in);
        
        boolean bool;
        System.out.print("Entre com um valor do tipo boolean: ");
        bool = leitura.nextBoolean();
        System.out.println("Valor do Booleano: "+bool+"\n");
        
        char ch;
        System.out.print("Entre com um valor do tipo char: ");
        ch = leitura.next().charAt(0);
        System.out.println("Valor do Char: "+ch+"\n");
        
        String str;
        System.out.print("Entre com um valor do tipo String: ");
        str = leitura.next();
        System.out.println("Valor do String: "+str+"\n");
        
        byte byt;
        System.out.print("Entre com um valor do tipo Byte: ");
        byt = leitura.nextByte();
        System.out.println("Valor do Byte: "+byt+"\n");
        
        short shor;
        System.out.print("Entre com um valor do tipo Short: ");
        shor = leitura.nextShort();
        System.out.println("Valor do Short: "+shor+"\n");
        
        int i;
        System.out.print("Entre com um valor do tipo int: ");
        i = leitura.nextInt();
        System.out.println("Valor do Int: "+i+"\n");
        
        long lon;
        System.out.print("Entre com um valor do tipo Long: ");
        lon = leitura.nextLong();
        System.out.println("Valor do Long: "+lon+"\n");
        
        float floa;
        System.out.print("Entre com um valor do tipo float: ");
        floa = leitura.nextFloat();
        System.out.println("Valor do Float: "+floa+"\n");
        
        double doub;
        System.out.print("Entre com um valor do tipo double: ");
        doub = leitura.nextDouble();
        System.out.println("Valor do Double: "+doub+"\n");
    }
}
