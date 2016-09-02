
package veiculo;

/**
 *
 * @author Tatiane Paz
 */
public class Main {

    /**
     * Exemplo da linguagem Java
     */
    public static void main(String[] args) {
        
        //Intânciar uma classe => Objeto
        Carro c4 = new Carro();
        Carro ix35 = new Carro();
        
        c4.ligar();
        c4.freio = false;
        c4.trocarMarcha();
        c4.acelerar(20);
        c4.trocarMarcha();
        c4.acelerar(50);
        c4.trocarMarcha();
        c4.acelerar(70);
        c4.desligar();
        
        ix35.ligar();
        ix35.freio = false;
        ix35.trocarMarcha();
        ix35.acelerar(17);
        ix35.trocarMarcha();
        ix35.acelerar(46);
        ix35.trocarMarcha();
        ix35.acelerar(66);
        ix35.desligar();
    }
    
}
