/**
 * Exercício 07
 * Criar dois vetores A e B cada um com 10 elementos inteiros. 
 * Construir um vetor C, onde cada elemento de C é a subtração 
 * dos respectivos elementos em A e B, ou seja: C[i] = A[i] – B[i]. 
 */
package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 * @author fernando
 */
public class exe07 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int A[] = new int[10];
        int B[] = new int[10];
        int C[] = new int[10];
        
        //Construção do vetor A
        for(int i = 0; i < A.length; i++){
            System.out.print("Entre como o valor para o elemento A["+i+"]: ");
            A[i] = t.nextInt();
        }
        
        //Construçao do vetor B
        for(int j = 0; j<B.length; j++){
            System.out.print("Entre como o valor para o elemento B["+j+"]: ");
            B[j] = t.nextInt();
        }
        
        //contruindo vetor C = A - B
        System.out.print("A = { ");
        for(int i=0; i<A.length; i++){
            C[i] = A[i] - B[i];
            System.out.print(A[i]+ ", ");
        }System.out.println("}");
        
        System.out.print("B = { ");
        for(int i=0; i<B.length; i++){
            C[i] = A[i] - B[i];
            System.out.print(B[i]+ ", ");
        }System.out.println("}");
        
        System.out.print("C = { ");
        for(int i=0; i<C.length; i++){
            C[i] = A[i] - B[i];
            System.out.print(C[i]+ ", ");
        }System.out.println("}");
    }
}
