package com.cursobasicojava.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class exe04 {
    /**
     * Exercício 04
     * Criar um vetor A com 15 elementos inteiros.
     * Construir um vetor B de mesmo tamanho, sendo
     * que cada elemento do vetor B deverá ser a raiz 
     * quadrada do respectivo elemento de A, ou seja: B[i] = sqrt(A[i]). 
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int A[] = new int[15];
        double B[] = new double[A.length];
        for(int i = 0; i < A.length; i++){
            System.out.print("Entre com o valor da posição: "+i+"-> ");
            A[i] = t.nextInt();
            B[i] = Math.sqrt(A[i]);
        }
        System.out.print("A = {");
        for(int j = 0; j<A.length; j++){
            System.out.print(A[j]+" ");
        }System.out.println("}");
        
        DecimalFormat df = new DecimalFormat("###,###.###");
        System.out.print("B = {");
        for(int j = 0; j<B.length; j++){
            System.out.print(df.format(B[j])+"   ");
        }System.out.println("}");
    }
}
