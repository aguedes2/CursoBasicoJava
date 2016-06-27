/*
 * Exercício 11
 * Criar um vetor A com 10 elementos inteiros. 
 * Implementar um programa que defina e escreva 
 * a quantidade de elementos armazenados neste 
 * vetor que são pares. 
 */
package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 * @author fernando
 */
public class exe11 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] A = new int[10];
        int cont = 0;
        for(int i = 0; i < A.length; i++){
            System.out.print("Entre com o valor para a posição "+i+": ");
            A[i] = t.nextInt();
        }
        for(int vlr: A){
            if(vlr%2 == 0){
                cont++;
            }
        }
        System.out.print("A = {");
        for(int j = 0; j<A.length; j++){
            System.out.print(A[j]+" ");
        }System.out.println("}");
        
        System.out.println(cont+ " números são pares.");
    }
}
