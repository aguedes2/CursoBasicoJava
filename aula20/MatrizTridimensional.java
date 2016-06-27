/**
 * Faça uma matriz 3x3x3, onde cada elemento seja a soma de seus índices.
 * Obtenha a soma de todos os elementos da matriz;
 * Obtenha a soma dos elementos que são pares;
 * Obtenha a soma dos elementos que são ímpares;
 * Exibir na tela a soma tota, a soma dos pares e a soma dos ímpares.
 */
package com.cursobasicojava.aula20;

/**
 *
 * @author fernando
 */
public class MatrizTridimensional {

    public static void main(String[] args) {
        int[][][] matrizTri = new int[3][3][3];

        //Contrução do Vetor Tridimensional, ou seja, vetor no R³
        for (int i = 0; i < matrizTri.length; i++) {
            for (int j = 0; j < matrizTri[i].length; j++) {
                for (int k = 0; k < matrizTri[i][j].length; k++) {
                    matrizTri[i][j][k] = i + j + k;
                }
            }
        }

        //Soma Total
        int soma = 0;
        for (int i = 0; i < matrizTri.length; i++) {
            for (int j = 0; j < matrizTri[i].length; j++) {
                for (int k = 0; k < matrizTri[i][j].length; k++) {
                    soma += matrizTri[i][j][k];
                }
            }
        }

        //Soma pares e ímpares
        int somaPares = 0, somaImpares = 0;
        for (int i = 0; i < matrizTri.length; i++) {
            for (int j = 0; j < matrizTri[i].length; j++) {
                for (int k = 0; k < matrizTri[i][j].length; k++) {
                    if (matrizTri[i][j][k] % 2 == 0) {
                        somaPares += matrizTri[i][j][k];
                    } else {
                        somaImpares += matrizTri[i][j][k];
                    }
                }
            }
        }
        System.out.println("A soma total dos elementos da Matriz é " + soma);
        System.out.println("A soma dos elementos pares é " + somaPares);
        System.out.println("A soma dos elementos ímpares é " + somaImpares);
    }
}
