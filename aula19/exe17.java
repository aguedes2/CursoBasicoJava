/*
 * Exercícios 17
 * Ler um vetor A com 10 elementos inteiros 
 * correspondentes as idades de um grupo de 
 * pessoas. Escreva um programa que determine 
 * e escreva a quantidade de pessoas que possuem 
 * idade superior a 35 anos.
 */
package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class exe17 {
    public static void main(String[] args) {
        int A[] = new int[10], cont = 0;
        Scanner t = new Scanner(System.in);
        
        for(int i = 0; i < A.length; i++){
            System.out.print("Digite a idade da "+(i+1)+" pessoa: ");
            A[i] = t.nextInt();
            if(A[i] > 35){
                cont++;
            }
        }
        System.out.print("A = {");
        for(int j = 0; j<A.length; j++){
            System.out.print(A[j]+" ");
        }System.out.println("}");
        
        System.out.println(cont+" pessoas têm idade superior à 35 anos.");
    }
}
