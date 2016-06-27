/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursobasicojava.aula20.exercicios;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class JogoDaVelha {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        char[][] jogoVelha = new char[3][3];

        System.out.println("jogador 1 = 'X'");
        System.out.println("jogador 2 = 'O'");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {
            if (jogada % 2 == 1) {//jogador 1

                System.out.println("Vez do jogador 1.\nEscolha a linha e a coluna de [1 - 3] ");
                sinal = 'X';

            } else {//Jogador 2

                System.out.println("Vez do jogador 2.\nEscolha a linha e a coluna de [1 - 3] ");
                sinal = 'O';

            }

            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.println("Entre com a linha (1, 2 ou 3)");
                linha = t.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Entrada inválida, tente novamente.");
                }
            }

            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.println("Entre com a coluna (1, 2 ou 3)");
                coluna = t.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Entrada inválida, tente novamente.");
                }
            }

            linha--;
            coluna--;
            if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
                System.out.println("Posição já usada, tente novamente");
            } else {
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }

            //imprimir o tabuleiro
            for (int i = 0; i < jogoVelha.length; i++) {
                for (int j = 0; j < jogoVelha[i].length; j++) {
                    System.out.print(jogoVelha[i][j] + " | ");
                }
                System.out.println("");
            }

            //verificar ganhador
            //Verificar  se o jogador 1 ganhou
            if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') //Linha 1
                    || (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X')//Linha 2
                    || (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X')//Linha 3
                    || (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X')//Coluna 1
                    || (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X')//Coluna 2
                    || (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X')//Coluna 3
                    || (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')//Diagonal Principal
                    || (jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X')//Diagonal Secundária
                    ) {
                System.out.println("Parabéns!\nJogador 1 venceu!");
                ganhou = true;
            } else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O')// Linha 1
                    || (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O')// Linha 2
                    || (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O')// Linha 3
                    || (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O')//Coluna 1
                    || (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O')//Coluna 2
                    || (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O')//Coluna 3
                    || (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')//Diagonal Principal
                    || (jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O')//Diagonal Secundária
                    ) {
                System.out.println("Parabens!\nJogador 2 venceu!");
                ganhou = true;
            }else if(jogada > 9){
                ganhou = true;
                System.out.println("Ninguém Ganhou!");
            }
        }
    }
}
