/*
 * Exercício 14
 * Criar um vetor vetorA com 10 elementos inteiros. 
 * Implementar um programa que defina e escreva 
 * a média aritmética simples dos elementos ímpares  
 * armazenados neste vetor.
 */
package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 * @author fernando
 */
public class exe14 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] vetorA = new int[10];
        int soma =0, cont =0;
        
        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Entre com o valor da posição: "+i+"-> ");
            vetorA[i] = t.nextInt();
        }
        
        for(int i=0; i < vetorA.length; i++){
            if(vetorA[i]%2 != 0){
                soma += vetorA[i];
                cont++;
            }
        }
        
        System.out.print("A = {");
        for(int j = 0; j<vetorA.length; j++){
            System.out.print(vetorA[j]+" ");
        }System.out.println("}");
        
        System.out.println("A soma é :"+soma);
        System.out.println("A média artimética dos termos ímpares do vetor é: "+(soma/cont));
    }
}
