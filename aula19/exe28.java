/**
 * Exercício 28
 * Ler um vetor A com 10 elementos e
 * construir um vetor B de mesmo tipo
 * e tamanho e com os mesmos elementos de A,
 * sendo que estes deverão estar invertidos,
 * ou seja, o primeiro elemento de A passa a 
 * ser o último de B, o segundo elemento de A
 * passa a ser o penúltimo de B e assim por diante.
 */
package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class exe28 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Digite o valor da posição "+i+": ");
            vetorA[i] = t.nextInt();
            vetorB[vetorA.length - i - 1] = vetorA[i];
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
