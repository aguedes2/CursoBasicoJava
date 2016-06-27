/**
 * Exercício 18
 * Ler um vetor A com 10 elementos inteiros 
 * correspondentes as idades de um grupo de 
 * pessoas. Escreva um programa que determine 
 * e escreva a menor e a maior idades e suas 
 * respectivas posições.
 */
package com.cursobasicojava.aula19;

import java.util.Scanner;

/**
 * @author fernando
 */
public class exe18 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int idades[] = new int[10];
        int menor = idades[0], indexMaior = 0, maior = idades[0],  indexMenor = 0;

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite a idade da " + (i + 1) + " pessoa: ");
            idades[i] = t.nextInt();
            if (idades[i] < menor) {
                menor = idades[i];
                indexMenor = i;
            } else if (idades[i] > maior) {
                maior = idades[i];
                indexMaior = i;
            }
        }

        System.out.print("A = {");
        for (int j = 0; j < idades.length; j++) {
            System.out.print(idades[j] + " ");
        }
        System.out.println("}");

        System.out.println("A maior idade foi digitada na posição " + (indexMaior + 1) + " e foi " + maior);
        System.out.println("A menor idade foi digitada na posição " + (indexMenor + 1) + " e foi " + menor);
    }

}
