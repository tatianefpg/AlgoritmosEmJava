
package SistemaBancario;

/**
 *
 * @author Tatiane Paz
 */
public class Conta {

    protected double saldo;
    public int conta;
    
    public void sacar(double valor){
        if(valor <= this.saldo){
            this.saldo -= valor;
        }
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public void verSaldo(){
        System.out.println("Saldo= "+this.saldo);
    }
    
}
