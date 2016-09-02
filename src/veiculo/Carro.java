
package veiculo;

import javax.swing.JOptionPane;

/**
 *
 * @author Tatiane Paz
 */
public class Carro {
    
    //Atributos
    public int ano;
    public String marca;
    private int marcha=0;
    public boolean ligado;
    public int velocidade;
    public boolean freio = true;
    
    //Obs. Os boolean inicialmente são falsos por padrão
    
    //Métodos
    public void ligar(){
        if(this.ligado == false){
            this.ligado = true;
            JOptionPane.showMessageDialog(null, "O carro está ligado!");
            //System.out.println("O carro está ligado!");
        }else{
            System.out.println("O carro já está ligado!");
        }
    }
    
    public void desligar(){
        if(this.ligado == true){
            this.ligado = false;
            JOptionPane.showMessageDialog(null, "O carro está desligado!");
            //System.out.println("O carro está desligado!");
        }else{
            System.out.println("O carro não está desligado!");
        }
    }
    
    public void trocarMarcha(){
        this.marcha +=1;
    }
    
    public void acelerar(int valor){
        if(this.ligado == true){
            if(this.freio == false){
                if(this.marcha == 0)
                    JOptionPane.showMessageDialog(null, "Está em ponto morto.");
                else if((this.marcha == 1)&&(velocidade <30)){
                    this.velocidade = valor;
                    JOptionPane.showMessageDialog(null, "Velocidade do carro = "+this.velocidade);
                }
                else if((this.marcha == 2)&&(velocidade <50)){
                    this.velocidade = valor;
                    JOptionPane.showMessageDialog(null, "Velocidade do carro = "+this.velocidade);
                }
                else if((this.marcha == 3)&&(velocidade <80)){
                    this.velocidade = valor;
                    JOptionPane.showMessageDialog(null, "Velocidade do carro = "+this.velocidade);                }
            }
        }
    }
}
