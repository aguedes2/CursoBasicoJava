/*
 * Exercício 20
 * Implementar um programa que obtenha a cotação do dólar (U$) 
 * em relação ao real (R$) e a seguir armazene em vetor vetorA 
 * com 20 elementos as seguintes conversões:
 * vetorA[i] = cotação do dolar * i, para todo i variando de 1 até 20.
 */
package com.cursobasicojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author fernando
 */
public class exe20 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        double[] vetorA = new double[20];
        double cotacao;
        int i;
        
        System.out.print("Entre com a cotação do dólar: ");
            cotacao = t.nextFloat();
        for (i = 0; i < vetorA.length; i++) {            
            vetorA[i] = cotacao * (i+1);
        }
        
        DecimalFormat df = new DecimalFormat("###,###.##");
        System.out.print("VetorA = ");
        for (i = 0; i < 20; i++) {
            System.out.println(df.format(vetorA[i])+" ");
        }System.out.println("");
    }
}
