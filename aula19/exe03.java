package com.cursobasicojava.aula19;

import java.util.Scanner;


public class exe03 {
    /**
     * Exercício 03
     * Criar um vetor A com 15 elementos inteiros.
     * Construir um vetor B de mesmo tipo e tamanho,
     * sendo que cada elemento do vetor B deverá ser
     * o quadrado do respectivo elemento de A, ou seja:
     * B[i] = A[i] * A[I]
    */
    
    /**
     * @autor FernandoGuedes
     * @param args 
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int A[] = new int[15];
        int B[] = new int[A.length];
        for(int i = 0; i < A.length; i++){
            System.out.print("Entre com o valor da posição: "+i+"-> ");
            A[i] = t.nextInt();
            B[i] = A[i]*A[i];
        }
        System.out.print("A = {");
        for(int j = 0; j<A.length; j++){
            System.out.print(A[j]+" ");
        }System.out.println("}");
        
        System.out.print("B = {");
        for(int j = 0; j<B.length; j++){
            System.out.print(B[j]+" ");
        }System.out.println("}");
    }
}
