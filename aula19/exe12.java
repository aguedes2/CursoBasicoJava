/*
 * Exercício 12
 * Criar um vetor A com 10 elementos inteiros. 
 * Implementar um programa que defina e escreva 
 * a soma de todos os elementos armazenados neste vetor
 */
package com.cursobasicojava.aula19;

/**
 * @author fernando
 */
public class exe12 {
    public static void main(String[] args) {
      
        int[] A = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int soma = 0;
        for(int i = 0; i < A.length; i++){
            soma += A[i]; 
        }  
        System.out.println("A soma de todos os termos de A é: "+soma);
    }
}
