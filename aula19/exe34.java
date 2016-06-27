/**
 * Exercício 34
 * Criar um vetor A com 10 elementos inteiros.
 * Escreva um programa que imprima cada elemento
 * do vetor A e a relação de todos os pares de 0
 * até o respectivo elemento.
 */
package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class exe34 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int vetorA[] = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Entre com o valor da posição A - " + i + ": ");
            vetorA[i] = t.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Analizando o numero "+vetorA[i]);
            for (int j = 2; j < vetorA[i]; j++) {
                if(j%2 == 0){
                    System.out.println(j+" é par");
                }
            }System.out.println("");
        }System.out.println("");
    }
}
