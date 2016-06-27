/**
 * Exercicio 25
 * Criar um vetor A com 10 elementos inteiros.
 * Construir um vetor B de mesmo tipo e tamanho,
 * obedecendo as seguintes regras de formação: 
 * a) Bi deverá receber 1 quando Ai for par; 
 * b) Bi deverá receber 0 quando Ai for ímpar.
 */
package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class exe25 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        for(int i = 0; i < vetorA.length; i++){
            System.out.print("Entre com o valor para a posição A["+i+"]: ");
            vetorA[i] = t.nextInt();
            
            vetorB[i] = (vetorA[i] % 2 == 0)? 1 : 0 ;
        }
        
        System.out.print("vetorA = {");
        for(int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i]+ "  ");
        }System.out.println("}");
        
        System.out.print("vetorB = {");
        for(int i = 0; i<vetorB.length; i++){
            System.out.print(vetorB[i]+ "  ");
        }System.out.println("}");
    }
}
