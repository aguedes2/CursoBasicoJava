package com.cursobasicojava.aula20;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class MatrizIrregular {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        System.out.print("Número de entrevistados: ");
        int numEntrevistados = t.nextInt();
        
        String[][] nomesFilhos = new String[numEntrevistados][];
        
        for(int i = 0; i < nomesFilhos.length; i++){
            System.out.println("Entrevistado "+(i+1));
            System.out.print("Número de filhos: ");
            int qtdFilhos = t.nextInt();
            
            //Alocando memória para quantidade de colunas dinamicamente
            nomesFilhos[i] = new String[qtdFilhos];
            
            //Perguntado nome dos filhos
            for(int j=0; j < nomesFilhos[i].length; j++){
                
                System.out.print("Nome do filho "+(j+1)+" ");
                nomesFilhos[i][j] = t.next();
            }
        }
        System.out.println("\n\n");
        for(int i = 0 ; i < nomesFilhos.length; i++){
            System.out.println("Pessoa "+i+" tem "+ nomesFilhos[i].length+" filhos.");
            for(int j = 0; j < nomesFilhos[i].length; j++){
                System.out.println(nomesFilhos[i][j]);
            }
        }
    }
    
}
