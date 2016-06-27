/**
 * Exercício 23
 * Criar um vetor A com 10 elementos inteiros.
 * Desenvolver um programa que verifique se
 * "todos" os elementos do vetor A são pares.
 * Se pelo menos um elemento do vetor não for par
 * o processo de repetição para percorrer os
 * elementos do vetor deve ser encerrado, como
 * sugestão: utilize uma variável do tipo flag
 * para atingir este propósito.
 */
package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class exe23 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] vetorA = new int[10];
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com o valor para a posição " + i + ": ");
            vetorA[i] = t.nextInt();
            if (vetorA[i] % 2 != 0) {
                System.out.println("\nParou!");
                System.out.println(vetorA[i] + " é ímpar");
                break;
            }
        }
    }
}
