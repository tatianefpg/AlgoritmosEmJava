/*
Faça um programa que o usuário poderá inserir um nome de cidade. O programa deverá informar:

* Qual o estado que a cidade pertence
* Se é capital ou não
* O conjunto de cidades permitidas devem ser as seguintes: Curitiba, Maringá, Londrina, Pinhais, Chapecó, Joinvile, Blumenau, Florianópolis, Porto Alegre, Gramado.

Cenário para testes: 

* Ao informar o nome da cidade Curitiba, deve retornar "Pertence ao PR", "É capital"

* Ao informar o nome da cidade Maringá, deve retornar "Pertence ao PR", "Não é capital"

* Ao informar o nome da cidade Porto Alegre, deve retornar "Pertence ao RS", "É capital"
 */
package desafioDeGeografia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tatiane Paz
 */
public class DesafioDeGeografia {

    public static void main(String[] args) {
        ArrayList<Cidade> cidades = new ArrayList<>();

        //Cadastro das cidades
        Cidade cidade1 = new Cidade();
        cidade1.setNome("Curitiba");
        cidade1.setEstado("Paraná");
        cidade1.setIsCapital(true);
        cidade1.setSigla("PR");
        cidades.add(0, cidade1);

        Cidade cidade2 = new Cidade();
        cidade2.setNome("Maringa");
        cidade2.setEstado("Paraná");
        cidade2.setIsCapital(false);
        cidade2.setSigla("PR");
        cidades.add(1, cidade2);

        Cidade cidade3 = new Cidade();
        cidade3.setNome("Londrina");
        cidade3.setEstado("Paraná");
        cidade3.setIsCapital(false);
        cidade3.setSigla("PR");
        cidades.add(2, cidade3);

        Cidade cidade4 = new Cidade();
        cidade4.setNome("Pinhais");
        cidade4.setEstado("Paraná");
        cidade4.setIsCapital(false);
        cidade4.setSigla("PR");
        cidades.add(3, cidade4);

        Cidade cidade5 = new Cidade();
        cidade5.setNome("Chapecó");
        cidade5.setEstado("Santa Catarina");
        cidade5.setIsCapital(false);
        cidade5.setSigla("SC");
        cidades.add(4, cidade5);

        Cidade cidade6 = new Cidade();
        cidade6.setNome("Joinvile");
        cidade6.setEstado("Santa Catarina");
        cidade6.setIsCapital(false);
        cidade6.setSigla("SC");
        cidades.add(5, cidade6);

        Cidade cidade7 = new Cidade();
        cidade7.setNome("Blumenau");
        cidade7.setEstado("Santa Catarina");
        cidade7.setIsCapital(false);
        cidade7.setSigla("SC");
        cidades.add(6, cidade7);

        Cidade cidade8 = new Cidade();
        cidade8.setNome("Florianópolis");
        cidade8.setEstado("Santa Catarina");
        cidade8.setIsCapital(true);
        cidade8.setSigla("SC");
        cidades.add(7, cidade8);

        Cidade cidade9 = new Cidade();
        cidade9.setNome("Porto Alegre");
        cidade9.setEstado("Rio Grande do Sul");
        cidade9.setIsCapital(true);
        cidade9.setSigla("RS");
        cidades.add(8, cidade9);

        Cidade cidade10 = new Cidade();
        cidade10.setNome("Gramado");
        cidade10.setEstado("Rio Grande do Sul");
        cidade10.setIsCapital(false);
        cidade10.setSigla("RS");
        cidades.add(9, cidade10);

        Scanner teclado = new Scanner(System.in);
        int loop = 1;

        //Repete o loop caso o usuario não digite 0 no final
        do {
            //Recebe a cidade do usuario
            System.out.print("Digite o nome da cidade: ");
            String leitura = teclado.next();
            int aux = 0;
            //Procura no array de cidades
            for (int i = 0; i < cidades.size(); i++) {
                //Compara a cidade que o usuario digitou com as cidades da lista
                if (leitura.equals(cidades.get(i).getNome())) {
                    System.out.print("\"Pertence ao " + cidades.get(i).getSigla() + "\"");
                    aux = 1;

                    //Verifica se a cidade é capital
                    if (cidades.get(i).isIsCapital()) {
                        System.out.println(", \"É Capital\"");
                    } else {
                        System.out.println(", \"Não é capital\"");
                    }
                }

            }

            if (aux != 1) {
                System.out.println("Cidade não encontrada.");
            }

            //Verifica se o usuario quer consultar outra cidade
            System.out.println("\nDeseja consultar outra cidade?\n1 - SIM\n0 - NÃO\n");
            System.out.print("Opção:");

            loop = teclado.nextInt();
            System.out.println("");
        } while (loop != 0);
    }

}
