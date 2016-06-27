/**
 * Exercício 2
 * Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9.
 * Após isso indique qual é o maior e o menor valor da linha 5 e qual
 * é o maior e o menor valor da coluna 7.
 */
package com.cursobasicojava.aula20.exercicios;

import java.util.Random;

/**
 *
 * @author fernando
 */
public class exe02 {

    public static void main(String[] args) {
        int[][] numAleatorios = new int[10][10];
        int maior7 = 0;
        int menor5 = 10, menor7 = 10;
        Random numRandom = new Random();
        
        
        //Gerando matriz com valores aleatórios
        for (int i = 0; i < numAleatorios.length; i++) {
            for (int j = 0; j < numAleatorios[i].length; j++) {
                numAleatorios[i][j] = numRandom.nextInt(9);
            }
        }

        for (int i = 0; i < numAleatorios.length; i++) {
            for (int j = 0; j < numAleatorios[i].length; j++) {
                System.out.print(numAleatorios[i][j] + " ");
            }
            System.out.println("");
        }
        
        int maiorL5 = 0, menorL5 = 10, col5 = 5;
        for(int i = 0; i < numAleatorios[col5].length; i++){
            if(numAleatorios[col5][i] > maiorL5){
                maiorL5 = numAleatorios[5][i];
            }
            if(numAleatorios[col5][i] < menorL5){
                menorL5 = numAleatorios[5][i];
            }
        }
        
        int maiorC7 = 0, menorC7 = 10, col7 = 7;
        for(int i = 0; i < numAleatorios.length; i++){
            if(numAleatorios[i][col7] > maiorC7){
                maiorC7 = numAleatorios[i][col7];
            }
            if(numAleatorios[i][col7] < menorC7){
                menorC7 = numAleatorios[i][col7];
            }
        }
        System.out.println("*************************************************");
        System.out.println("O maior elemento na linha 5 é "+maiorL5);
        System.out.println("O menor elemento na linha 5 é "+menorL5);
        System.out.println("O maior elemento na coluna 7 é "+maiorC7);
        System.out.println("O menor elemento da coluna 7 é "+menorC7);
        System.out.println("*************************************************");
    }
}
