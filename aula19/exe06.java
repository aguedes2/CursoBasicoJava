/**
 * Exercício 06
 * Criar dois vetores A e B cada um com 10 elementos inteiros. 
 * Construir um vetor C, onde cada elemento de C é a soma dos 
 * respectivos elementos em A e B, ou seja: C[i] = A[i] + B[i].
 */
package com.cursobasicojava.aula19;

/**
 * @author fernando
 */
public class exe06 {
    public static void main(String[] args) {
       int A[] = new int[10];
       int B[] = new int[A.length];
       int C[] = new int[A.length];
    //construir vetores A e B
        System.out.print("Vetor A = { ");
        for(int i = 0; i < 10; i++){
            A[i] = (int)(1 + (Math.random()*(15-1)));
            System.out.print(A[i]+", ");
        }System.out.println("}");
        
        System.out.print("Vetor B = { ");
        for(int i = 0; i < 10; i++){
            B[i] = (int)(1 + (Math.random()*(15-1)));
            System.out.print(" "+B[i]);
        }System.out.println("}");
        
        //Contruir vetor C
        System.out.print("Vetor B = { ");
        for(int i = 0; i < 10; i++){
            C[i] = A[i] + B[i];
            System.out.print(" "+C[i]);
        }System.out.println("}");
    }
}
