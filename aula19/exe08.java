/**
 * Exercício 08
 * Criar dois vetores A e B cada um com 10 elementos inteiros.
 * Construir um vetor C, onde cada elemento de C é a 
 * multiplicação dos respectivos elementos em A e B, ou seja: 
 * C[i] = A[i] * B[i]. 
 */
package com.cursobasicojava.aula19;

/**
 *
 * @author fernando
 */
public class exe08 {
    public static void main(String[] args) {
        int A[] = new int[10];
        int B[] = new int[10];
        int C[] = new int[10];
        //contruindo vetor A
        System.out.print("A = {");
        for(int i = 0; i < A.length; i++){
            A[i] = (int)(1 + Math.random()*(16-1));
            System.out.print(A[i]+", ");
        }System.out.println("}");
        
        //construindo vetor B
        System.out.print("B = {");
        for(int i = 0; i < B.length; i++){
            B[i] = (int)(1 + Math.random()*(16-1));
            System.out.print(B[i]+", ");
        }System.out.println("}");
        //contruindo vetor C = A * B
        System.out.print("C = {");
        for(int i = 0; i < C.length; i++){
            C[i] = A[i] * B[i];
            System.out.print(C[i]+ ", ");
        }System.out.println("}");
    }
}
