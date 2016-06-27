/*
 * Exercício 19
 * Ler as duas notas bimestrais para um conjunto de 10 alunos. 
 * Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do tipo real. 
 * Escreva um programa que calcule a média aritmética simples das notas 
 * informadas armazenando o resultado em um vetor “Result” de mesmo 
 * tipo e tamanho. Ao mostrar os resultados exibir a situação de cada aluno. 
 * Se a média calculada for superior ou igual a 7 o aluno estará “aprovado”, 
 * caso contrário, a situação do aluno será “reprovado”.
 */
package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class exe19 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        double[] notas1 = new double[10];
        double[] notas2 = new double[10];
        double[] result = new double[10];

        System.out.println("Digitando as primeiras notas dos alunos:");
        for (int i = 0; i < notas1.length; i++) {
            System.out.print("Entre com a nota 1 do aluno " + (i + 1) + ": ");
            notas1[i] = t.nextFloat();
            
            System.out.print("Entre com a nota 1 do aluno " + (i + 1) + ": ");
            notas2[i] = t.nextFloat();
            
            result[i] = (notas1[i] + notas2[i])/2;
        }

        //outputs
        System.out.print("Notas 1 = ");
        for(int i = 0; i<notas1.length; i++){
            System.out.print(notas1[i]+" ");
        }System.out.println("");
        
        System.out.print("Notas 2 = ");
        for(int i = 0; i<notas2.length; i++){
            System.out.print(notas2[i]+" ");
        }System.out.println("");
        
        System.out.print("Resultados = ");
        for(int i = 0; i<result.length; i++){
        
            if (result[i] >= 7) {
                System.out.println(result[i] + " - APROVADO");
            } else {
                System.out.println(result[i] + " - REPROVADO");
            }
        }System.out.println("");
    }
}
