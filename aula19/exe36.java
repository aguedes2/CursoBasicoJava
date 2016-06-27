/**
 * Exercício 36
 * Criar um vetor A com 11 elementos,
 * indexados de 0 até 10. Sendo que
 * cada elemento do vetor A é formado
 * pela potência de base 2 elevado ao
 * expoente igual a posição do respectivo
 * elemento, ou seja: A[i] = 2i. Sugestão int A[11];
 */
package com.cursobasicojava.aula19;

/**
 *
 * @author fernando
 */
public class exe36 {

    public static void main(String[] args) {
        int vetorA[] = new int[11];
        for (int i = 0; i < vetorA.length; i++) {
                vetorA[i] = (int)Math.pow(2, i);
                }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("A[" + i + "] = " + vetorA[i]);
        }

    }

}
