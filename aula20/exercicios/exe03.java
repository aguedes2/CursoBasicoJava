/**
 * Exercício 3
 * Capture do teclado valores para preenchimento de uma matriz M 3x3.
 * Após a captura imprima a matriz criada e encontre a quantidade de
 * números pares, a quantidade de números ímpares
 */
package com.cursobasicojava.aula20.exercicios;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class exe03 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int[][] M = new int[3][3];
        int qtdPares = 0, qtdImpares = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print("Entre com o valor para a posição M[" + i + "][" + j + "]: ");
                M[i][j] = t.nextInt();
                if (M[i][j] % 2 == 0) {
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("***************************************************");
        System.out.println("Foram digitados " + qtdPares + " números pares.");
        System.out.println("Foram digitados " + qtdImpares + " números ímpares.");
        System.out.println("***************************************************");
    }
}
