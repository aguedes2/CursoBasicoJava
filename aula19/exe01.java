package com.cursobasicojava.aula19;

import java.util.Scanner;


public class exe01 {
    /**
     * Exercício 1
     * Criar um vetor A com 5 elementos inteiros. 
     * Construir um vetor B de mesmo tipo e tamanho 
     * e com os "mesmos" elementos do vetor A, ou seja,
     * B[i] = A[i].
     */
    
    /**
     * @author fernando
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] vetorA = new int[5];
        int B[] = new int[vetorA.length];
        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Entre com o valor da posição: "+i+"-> ");
            vetorA[i] = t.nextInt();
            B[i] = vetorA[i];
        }
        
        System.out.print("A = {");
        for(int j = 0; j<vetorA.length; j++){
            System.out.print(vetorA[j]+" ");
        }System.out.println("}");
        
        System.out.print("B = {");
        for(int j = 0; j<B.length; j++){
            System.out.print(B[j]+" ");
        }System.out.println("}");
    }
}
