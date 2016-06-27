package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class exe02 {
    /**
     * Exercício 02
     * Criar um vetor A com 8 elementos inteiros.
     * Construir um vetor B de mesmo tipo e tamanho
     * e com os elementos do vetor A multiplicados
     * por 2, ou seja: B[i] = A[i] * 2. 
    */
    
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int A[] = new int[8];
        int B[] = new int[A.length];
        for(int i = 0; i < A.length; i++){
            System.out.print("Entre com o valor da posição: "+i+"-> ");
            A[i] = t.nextInt();
            B[i] = A[i]*2;
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
