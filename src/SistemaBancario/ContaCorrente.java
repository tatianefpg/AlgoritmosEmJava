
package SistemaBancario;

/**
 *
 * @author Tatiane Paz
 */
public final class ContaCorrente extends Conta{
    
    //Rescreve o método da classe pai
    @Override
     public void sacar(double valor){
        super.sacar(valor);
        this.juro();
    }
     
    @Override
    protected void juro(){
        this.saldo -= 1;
    }
}
