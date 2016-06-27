/**
 * Criar dois vetores A e B cada um com 10 elementos inteiros.
 * Construir um vetor C de mesmo tipo e tamanho, obedecendo as
 * seguintes regras de formação: 
 * a) Ci deverá receber 1 quando Ai for maior que Bi; 
 * b) Ci deverá receber 0 quando Ai for igual a Bi; 
 * c) Ci deverá receber -1 quando Ai for menor que Bi
 */
package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 * @author fernando
 */
public class exe26 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int vetorA[] = new int[10];
        int vetorB[] = new int[10];
        int vetorC[] = new int[10];
        //Construindo vetor A e B
        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Entre com o valor para a posição A["+i+"]: ");
            vetorA[i] = t.nextInt();
        }
        
        for(int i = 0; i < vetorB.length; i++){
            System.out.print("Entre com o valor para a posição B["+i+"]: ");
            vetorB[i] = t.nextInt();
        }
        System.out.print("vetorA = {");
        for(int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i]+ "  ");
        }System.out.println("}");
        
        System.out.print("vetorB = {");
        for(int i = 0; i<vetorB.length; i++){
            System.out.print(vetorB[i]+ "  ");
        }System.out.println("}");
        
        //Construindo o vetor c
        System.out.print("vetorC = {");
        for(int i = 0; i< vetorA.length; i++){
            if(vetorA[i] > vetorB[i]){
               vetorC[i] = 1;
            }else if(vetorA[i]== vetorB[i]){
                vetorC[i] = 0;
            }else if(vetorA[i] < vetorB[i]){
                vetorC[i] = -1;
            }
            System.out.print(vetorC[i] + "  ");
        }
        System.out.println("}");
    }
}
