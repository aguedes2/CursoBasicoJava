/**
 * Exercício 05
 * Criar um vetor A com 10 elementos inteiros. 
 * Construir um vetor B de mesmo tipo e tamanho,
 * sendo que cada elemento do vetor B deverá ser
 * o respectivo elemento de A multiplicado por sua 
 * posição (ou índice), ou seja: B[i] = A[i] * i. 
 */
package com.cursobasicojava.aula19;

/**
 * @author fernando
 */
public class exe05 {
    public static void main(String[] args) {
        int A[] = {4, 8, 12, 16, 20, 24, 28, 32, 36, 40};
        int B[] = new int[A.length];
        for(int i=0; i<B.length; i++){
            B[i] = A[i]*i;
            System.out.printf("  %d",B[i]);
        }System.out.println("");
    }
}
