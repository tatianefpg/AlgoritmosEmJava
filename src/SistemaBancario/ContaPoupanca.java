
package SistemaBancario;

/**
 *
 * @author Tatiane Paz
 */
public final class ContaPoupanca extends Conta{    
    
    public void depositar(double valor){
        super.depositar(valor);
        this.juro();
    }
    
    //Overloading
    @Override
    protected void juro(){
        this.saldo += 1;
    }
}
