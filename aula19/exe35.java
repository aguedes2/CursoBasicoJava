/**
 * Exercício 35.
 * Criar um vetor A com 10 elementos inteiros.
 * Escreva um programa que imprima cada elemento
 * do vetor A e a relação de todos os divisores
 * do respectivo elemento.
 */
package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class exe35 {

    public static void main(String[] args) {
       Scanner t = new Scanner(System.in);
        int vetorA[] = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com o valor da posição A - " + i + ": ");
            vetorA[i] = t.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++) {
            
            System.out.println("Analizando o número "+vetorA[i]);
            for (int j = 1; j <= vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    System.out.print(j + " é dividisor.");
                }
            }
        }
        System.out.println("");
    }
}
