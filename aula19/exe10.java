/**
 * Exercício 10
 * Criar dois vetores A e B cada um com 10 elementos inteiros.
 * Construir um vetor C, onde cada elemento de C é a subtração
 * dos respectivos elementos em A e B, ou seja: C[i] = A[i] – B[i].
 */
package com.cursobasicojava.aula19;

/**
 *
 * @author fernando
 */
public class exe10 {
    public static void main(String[] args) {
        int A[] = new int[10];
        int B[] = new int[A.length];
        System.out.print("A = {");
        for(int i = 0; i < A.length; i++){
            A[i] = (int)(1 + Math.random()*(16-1));
            System.out.print(A[i]+ ", ");
        }System.out.println("}");
        
        System.out.print("B = {");
        for(int i = 0; i < B.length; i++){
            B[i] = A[i]%2;
            System.out.printf("%d, ",B[i]);
        }System.out.println("}");
    }
}
