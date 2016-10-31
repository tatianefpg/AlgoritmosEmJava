package exemploJava;

/**
 *
 * @author Tatiane Paz
 */
public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        
        carro1.setCor("Preto");
        carro1.setTipo("Passeio");
        carro1.setPlaca("AAA-0909");
        carro1.setNumPortas(2);

        System.out.println("**** Carro ****");
        System.out.println("Tipo: "+carro1.getTipo());
        System.out.println("Cor: "+carro1.getCor());
        System.out.println("Placa: "+carro1.getPlaca());
        System.out.println("NumPortas: "+carro1.getNumPortas());
    }
    
}
