/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cursobasicojava.aula21;

import java.util.Random;

/**
 *
 * @author fernando
 */
public class ForEach {
    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        
        int[] notas = new int [10];
        
        for(int i = 0; i < notas.length; i++){
            notas[i] = aleatorio.nextInt(11);
        }
        
        //imprimindo os termos com ForEach
        for(int nota : notas){
            System.out.print(nota+" ");
        }System.out.println("");
        
        //Array com foreach
        System.out.println("************************************");
        int[][] notasAlunos = new int[3][4];
        
        
        for(int i=0; i < notasAlunos.length; i++){
            for(int j = 0; j< notasAlunos[i].length; j++){
                notasAlunos[i][j] = aleatorio.nextInt(11);
            }
        }
        
        //imprimir
        int k = 1;
        
        for(int[] notaAluno : notasAlunos) //Percorre as linhas
        {
            System.out.println("Notas aluno "+k);
            int j = 0;
            int soma = 0;
            double media;
            for(int nota : notaAluno) //Percorre as colunas
            {
                j++;
                System.out.print(nota+ " ");
                soma +=nota;
            }System.out.println("");
            media = soma/j;
            System.out.printf("Media aluno %d = %.2f ",k,Math.ceil(media));
            if(media >= 6){
                System.out.println("--> Aprovado");
            }else{
                System.out.println("--> Reprovado");
            }
            k++;
        }
    }
}
