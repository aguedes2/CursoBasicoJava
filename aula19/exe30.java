/**
 * Exercício 30
 * Ler um vetor A com 20 elementos.
 * Construir dois vetores B e C,
 * sendo que nos vetor B e C serão
 * armazenados o valores pares e ímpares de A, respectivamente.
 */
package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class exe30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length]; // pares
        int[] vetorC = new int[vetorA.length]; //ímpares
        
        for(int i=0;i<vetorA.length; i++){
            System.out.print("Digite o valor para A["+i+"]: ");
            vetorA[i] = scan.nextInt();
        }
        int posB = 0;
        int posC = 0;
        //construir B
        for(int i = 0; i<vetorA.length; i++){
            if(vetorA[i]%2 == 0){
               vetorB[posB] = vetorA[i];
               posB++;
            }else{
               vetorC[posC] = vetorA[i];
               posC++;
            }
        }
        
        //imprimindo vetores
        //A
        System.out.print("A = {");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }System.out.println("}");
        
        //B
        System.out.print("B = {");
        for(int i = 0; i < posB; i++){
            System.out.print(vetorB[i]+" ");
        }System.out.println("}");
        //C
        System.out.print("C = {");
        for(int i = 0; i < posC; i++){
            System.out.print(vetorC[i]+" ");
        }System.out.println("}");
    }
}
