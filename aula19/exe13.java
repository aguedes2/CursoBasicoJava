/*
 * Exercício 12
 * Criar um vetor A com 10 elementos inteiros. 
 * Implementar um programa que determine a soma 
 * dos elementos armazenados neste vetor que são 
 * múltiplos de 5.
 */
package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 * @author fernando
 */
public class exe13 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] A = new int[10];
        int soma = 0;
        
        for(int i = 0; i < A.length; i++){
            System.out.print("Entre com o valor da posição: "+i+"-> ");
            A[i] = t.nextInt();
        }
        
        for(int i = 0; i < A.length; i++){
            if(A[i]%5 == 0){
                soma += A[i];
            }
        }
        System.out.print("A = {");
        for(int j = 0; j<A.length; j++){
            System.out.print(A[j]+" ");
        }System.out.println("}");
        
        System.out.println("A soma dos múltiplos de 5 do vetor é: "+ soma);
    }
}
