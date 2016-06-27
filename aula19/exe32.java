/**
 * Exercício 32
 * Criar um vetor A com 5 elementos inteiros.
 * Escreva um programa que imprima a tabuada
 * de cada um dos elementos do vetor A.
 */
package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class exe32 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int vetorA[] = new int[5];
        
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor para a posição A[" + (i + 1) + "]: ");
            vetorA[i] = t.nextInt();

        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Tabuada de "+vetorA[i]);
            for (int j = 1; j <= 10; j++ ) {
                System.out.println(vetorA[i]+" X "+ j +" = "+ (vetorA[i]*j));
            }System.out.println("\n");
        }
    }
}
