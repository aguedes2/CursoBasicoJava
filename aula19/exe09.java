/**
 * Exercício 09
 * Criar dois vetores A e B cada um com 10 elementos inteiros. 
 * Construir um vetor C, onde cada elemento de C é a divisão dos 
 * respectivos elementos em A e B, ou seja: C[i] = A[i] / float(B[i])
 */
package com.cursobasicojava.aula19;

import java.text.DecimalFormat;

/**
 *
 * @author fernando
 */
public class exe09 {
    public static void main(String[] args) {
        int A[] = new int[10];
        float B[] = new float[10];
        double C[] = new double[10];
        
        System.out.print("A = {");
        for(int i = 0; i< A.length; i++){
            A[i] = (int)(1 + Math.random()*(16-1));
            System.out.print(A[i]+", ");
        }System.out.println("}");
        
        System.out.print("B = {");
        for(int i = 0; i< B.length; i++){
            B[i] = (float)(1 + Math.random()*(16-1));
            System.out.printf("%.2f, ",B[i]);
        }System.out.println("}");
        
        DecimalFormat forma = new DecimalFormat("###,###.##");
        System.out.print("C = {");
        for(int i = 0; i< C.length; i++){
            C[i] = A[i] / B[i];
            System.out.printf(forma.format(C[i])+" ");
        }System.out.println("}");
    }
}
