/**
 * Exercício 1
 * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0 e 9.
 * Após isso determine o maior número da matriz e a sua posição (linha, coluna).
 */
package com.cursobasicojava.aula20.exercicios;

import java.util.Random;

/**
 *
 * @author fernando
 */
public class exe01 {

    public static void main(String[] args) {
        int[][] numerosAleatorios = new int[4][4];
        
        Random numeroRandom = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandom.nextInt(9);
            }
        }

        int soma = 0, maior = 0, linhaMaior = 0, colunaMaior = 0;
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                soma += numerosAleatorios[i][j];
                if (numerosAleatorios[i][j] > maior) {
                    maior = numerosAleatorios[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("Impressão da matriz[ 4 x 4]");
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("A soma dos elementos da matriz é " + soma);
        System.out.println("O maior valor: " + maior);
        System.out.println("A linha do maior valor: " + linhaMaior + " coluna: " + colunaMaior);
    }
}
