/*
 Faça um programa que o usuário poderá inserir um número. O programa deverá retornar em tela se o número digitado:

* é ou não PAR 
* é ou não IMPAR 
* é ou não maior que 10
* o dobro do valor digitado
* é ou não primo

Cenário para testes: 

* Ao informar o número 2, deve retornar "é par", "não é impar", "não é maior que 10", "o dobro de 2 é 4", "é primo"

* Ao informar o número 11, deve retornar "não é par", "é impar", "é maior que 10", "o dobro de 11 é 22", "é primo"
 */
package desafioMatematica;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Tatiane Paz
 */
public class Calcula {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero = -1;

        leNumero(numero, teclado);
    }

    private static void leNumero(int numero, Scanner teclado) {
        //Recebe um valor do usuario
        System.out.print("Digite um numero inteiro: ");
        numero = teclado.nextInt();
        imprimir(numero, teclado);

    }

    private static void imprimir(int numero, Scanner teclado) {
        //Imprime informações sobre o numero
        verificaNPar(numero);
        verificaNMaior10(numero);
        calculaDobro(numero);
        verificaNPrimo(numero);

        //Verifica se o usuario deseja digitar outro numero
        do {
            System.out.println("\nDeseja digitar outro número?\n1 - SIM\n0 - NÃO");
            System.out.print("Opção: ");

            numero = teclado.nextInt();
            //Repete o processo pois o usuario quer digitar outro numero
            if (numero == 1) {
                System.out.println("");
                leNumero(numero, teclado);
            }
            //Verifica a opcao do usuario   
        } while (numero == 0);
    }

    //Verifica se o numero é par
    private static void verificaNPar(int numero) {
        if (numero % 2 == 0) {
            System.out.print("\"é par\", \"não é impar\"");
        } else {
            System.out.print("\"não é par\", \"é impar\"");
        }
    }

    //Verifica se o numero é maior que 10
    private static void verificaNMaior10(int numero) {
        if (numero < 10) {
            System.out.print(", \"não é maior que 10\"");
        } else if (numero == 10) {
            System.out.print(", \"é maior que 10\"");
        } else {
            System.out.print(", \"é igual a 10\"");
        }
    }

    //Calcula o dobro do numero
    private static void calculaDobro(int numero) {
        System.out.print(", \"o dobro de " + numero + " é " + numero * 2 + "\"");
    }

    //Verifica se o numero é primo
    private static void verificaNPrimo(int numero) {
        int k = 1, primo = 0;

        if (numero > 1) {
            for (k = 2; k <= (numero / 2); k++) {
                if (numero % k == 0) {
                    primo = 0;
                    k = numero;
                }
            }
        }
        if ((primo == 1) || (numero == 1)) {
            System.out.println(", \"é primo\"");
        } else {
            System.out.println(", \"não é primo\"");
        }
    }

}
