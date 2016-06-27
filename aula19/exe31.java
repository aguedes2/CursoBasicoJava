/**
 * Exercício 31
 * Ler um vetor A com 20 elementos.
 * Separar os elementos pares e ímpares de
 * A utilizando apenas um vetor extra B.
 * Sugestão: no início do vetor B armazene
 * os elementos pares de A e nas posições
 * restantes do vetor B armazene os elementos de A que são ímpares
 */
package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class exe31 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int vetorA[] = new int[20];
        int vetorB[] = new int[vetorA.length];
        int c = 0;
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor para a posição A[" + (i + 1) + "]: ");
            vetorA[i] = t.nextInt();

        }
        for (int i = 0; i < vetorB.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[c] = vetorA[i];
                c++;
            }
        }
        for (int i = 0; i < vetorB.length; i++) {
            if (vetorA[i] % 2 != 0) {
                vetorB[c] = vetorA[i];
                c++;
            }
        }
        
        System.out.print("A = {");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("}");

        System.out.print("B = {");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println("}");
    }
}
