/*
Faça um programa que o usuário poderá inserir um texto. O programa deverá informar:

* quantidade de caracteres do texto
* quantidade de espaços em branco no texto
* quantidade de vogais digitadas

Cenário para testes: 

* Ao informar o texto DB1, deve retornar "3 caracteres", "0 espaços em branco", "0 vogais"

* Ao informar o texto DB1 START, deve retornar "9 caracteres", "1 espaço em branco", "1 vogal"
 */
package DesafioDePortugues;

import java.util.Scanner;

/**
 *
 * @author Tatiane Paz
 */
public class DesafioDePortugues {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Recebe uma frase do usuario
        System.out.print("Insira um texto: ");
        String texto = teclado.nextLine();

        imprime(texto);
        
        System.out.println("");
    }

    //Imprime os dados da frase
    public static void imprime(String texto) {
        //Imprime a quantidade d caracteres
        System.out.print("\"" + texto.length() + " caracteres\"");
        //IMprime a quantidade de espaços em branco
        System.out.print(" ,\"" + contaEspacos(texto) + " espaço em branco\"");
        //Imprime a quantidade de vogais
        System.out.print(" ,\"" + contaVogais(texto) + " vogais\"");
    }

    //Conta a quantidade de espaços na grase
    public static int contaEspacos(String texto) {
        return texto.length() - texto.replaceAll(" ", "").length();
    }

    //Conta a quantidade de vogais na frase
    public static int contaVogais(String texto) {
        int contarVogais = 0;
        //Percorre pela frase comparando a letra(i) com as vogais
        for (int i = 0; i < texto.length(); i++) {
            if ((texto.charAt(i) == 'a') || (texto.charAt(i) == 'A')
                    || (texto.charAt(i) == 'e') || (texto.charAt(i) == 'E')
                    || (texto.charAt(i) == 'i') || (texto.charAt(i) == 'I')
                    || (texto.charAt(i) == 'o') || (texto.charAt(i) == 'O')
                    || (texto.charAt(i) == 'u') || (texto.charAt(i) == 'u')) {
                contarVogais++;
            }
        }
        return contarVogais;
    }
}
