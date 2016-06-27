/**
 * Exercício 37
 * Criar um vetor A com 15 elementos inteiros.
 * Construir um vetor B de mesmo tamanho,
 * sendo que cada elemento do vetor B seja o
 * fatorial do elemento correspondente em A.
 */
package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class exe37 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int vetorA[] = new int[15];
        int[] vetorB = new int[vetorA.length];
        String fat = " ";
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor de A-"+i+" ");
            vetorA[i] = t.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = 1;
            for (int j = 1; j <= vetorA[i]; j++) {
                vetorB[i] *= j;
            }
        }
        System.out.print("vetorA = {");
        for(int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i]+ "  ");
        }System.out.println("}");
        
        System.out.print("vetorB = {");
        for(int i = 0; i<vetorB.length; i++){
            System.out.print(vetorB[i]+ "  ");
        }System.out.println("}");
    }
}
