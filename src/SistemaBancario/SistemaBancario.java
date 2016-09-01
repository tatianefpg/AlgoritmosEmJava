
package SistemaBancario;

/**
 *
 * @author Tatiane Paz
 */
public class SistemaBancario {
    public static void main(String[] args) {
        
        ContaCorrente c1 = new ContaCorrente();
        c1.depositar(100);
        c1.sacar(50);
        c1.verSaldo();
        
        ContaPoupanca p1 = new ContaPoupanca();
        p1.depositar(100);
        p1.sacar(50);
        p1.verSaldo();
    }
}
