/*
 *  Exercício 22
 *  Gerar aleatoriamente um vetor vetorA com 10 elementos inteiros e iguais a 0 e 1, 
 *  sugestão: vetorA[i] = (int)Math.round(Math.random() * 1); 
 *  Pede-se para implementar um programa que determine o percentual de números 0's e 1's 
 *  existentes no vetor vetorA. 
 */
package com.cursobasicojava.aula19;

import java.text.DecimalFormat;

/**
 * @author fernando
 */
public class exe22 {

    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int cont1 = 0, cont0 = 0;
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);
            if (vetorA[i] == 1) {
                cont1++;
            } else {
                cont0++;
            }
        }
        System.out.print("VetorA = {");
        for(int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i]+" ");
        }System.out.println("}");
        DecimalFormat df = new DecimalFormat("###,###.##");
        System.out.println("Porcentagem de 0 = "+ df.format(cont0*100/vetorA.length)+"%");
        System.out.println("Procentagem de 1 = "+df.format((cont1 * 100)/vetorA.length)+"%");
    }
}
