/*
 * Exercício 16  
 * Criar um vetor A com 10 elementos inteiros. 
 * Escrever um programa que calcule e escreva: 
 * a) a soma de elementos armazenados neste vetor que são inferiores a 15; 
 * b) a quantidade de elementos armazenados no vetor que são iguais a 15; e 
 * c) a média dos elementos armazenados no vetor que são superiores a 15. 
 */
package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 * @author fernando
 */
public class exe16 {
    public static void main(String[] args) {
         Scanner t = new Scanner(System.in);
        int A[] = new int[10];
        int somaMenor = 0, cont = 0, contMaior = 0, somaMaior = 0; 
        
        for(int i = 0; i < A.length; i++){
            System.out.print("Entre com o valor da posição: "+i+"-> ");
            A[i] = t.nextInt();
        }
        
        for(int vlr: A){
            if(vlr == 15){
                cont++;
            }else if(vlr < 15){
                somaMenor += vlr;
            }else if(vlr > 15){
                contMaior++;
                somaMaior += vlr;
            }
        }
        
        System.out.print("A = {");
        for(int j = 0; j<A.length; j++){
            System.out.print(A[j]+" ");
        }System.out.println("}");
        
        System.out.println("a) A soma dos valores menores que 15 é: "+ somaMenor);
        System.out.println("b) Existem "+cont+" valores iguais a 15");
        System.out.println("a) A média dos valores maiores que 15 é: "+ (somaMaior / contMaior));
    }
}
