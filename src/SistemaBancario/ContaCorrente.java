
package SistemaBancario;

/**
 *
 * @author Tatiane Paz
 */
public class ContaCorrente extends Conta{
    
    //overrding
     public void sacar(double valor){
        super.sacar(valor);
        this.juro();
    }
     
    private void juro(){
        this.saldo -= 1;
    }
}
