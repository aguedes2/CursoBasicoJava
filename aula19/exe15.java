/*
 * Exercpucui 15
 * Criar um vetor A com 10 elementos inteiros. 
 * Desenvolver um programa que defina o percentual 
 * de elementos pares e ímpares, respectivamente, 
 * armazenados neste vetor.
 */
package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class exe15 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int A[] = new int[10];
        float contP = 0, contI = 0;
        
        for(int i = 0; i < A.length; i++){
            System.out.print("Entre com o valor da posição: "+i+"-> ");
            A[i] = t.nextInt();
        }
        
        for(int i = 0; i < A.length; i++){
            if(A[i]%2==0){
                contP++;
            }else{
                contI++;
            }
        }
        
        System.out.print("A = {");
        for(int j = 0; j<A.length; j++){
            System.out.print(A[j]+" ");
        }System.out.println("}");
        
        System.out.println("O Percentual de Pares: "+contP*100/A.length);
        System.out.println("O percentual de ímpares: "+contI*100/A.length);
    }
}
