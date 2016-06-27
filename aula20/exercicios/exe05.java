/**
 * Exercício 5
 * Modifique o programa anterior de maneira a guardar
 * os compromissos de todo o ano, organizados por mês,
 * dia e hora (só 8 horas por dia).
 */
package com.cursobasicojava.aula20.exercicios;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class exe05 {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        String[][][] agenda = new String[12][31][8];
        boolean sair = false;
        byte opcao;
        while (!sair) {
            System.out.println("Para adicionar compromisso: 1");
            System.out.println("Para ver um compromisso: 2");
            System.out.println("Para ver os compromissos do dia: 3");
            System.out.println("Para sair: 0");
            opcao = t.nextByte();
            switch (opcao) {
                case 1:
                    boolean mesValido = false;
                    int mes = 0;
                    while (!mesValido) {
                        System.out.print("Digite o mês do compromisso: ");
                        mes = t.nextInt();
                        if (mes > 0 && mes <= 12) {
                            mesValido = true;
                        } else {
                            System.out.println("Mês inválido, digite novamente.");
                        }
                    }mes--;
                    boolean diaValido = false;
                    int dia = 0;
                    while (!diaValido) {
                        System.out.print("Digite o dia do compromisso: ");
                        dia = t.nextInt();
                        if (dia > 0 && dia <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("Dia inválido, digite novamente.");
                        }
                    } dia--;
                    boolean horaValida = false;
                    int hora = 0;
                    while (!horaValida) {
                        System.out.print("Digite a hora do compromisso: ");
                        hora = t.nextInt();
                        if (hora >= 0 & hora <= 8) {
                            horaValida = true;
                        }else{
                            System.out.println("Hora inválida, digite novamente.");
                        }
                    }
                    agenda[mes][dia][hora] = t.next();
                    break;
                case 2:
                    mesValido = false;
                    mes = 0;
                    while (!mesValido) {
                        System.out.print("Digite o mês do compromisso: ");
                        mes = t.nextInt();
                        if (mes > 0 && mes <= 12) {
                            mesValido = true;
                        } else {
                            System.out.println("Mês inválido, digite novamente.");
                        }
                    }mes--;
                    diaValido = false;
                    dia = 0;
                    while (!diaValido) {
                        System.out.print("Digite o dia do compromisso: ");
                        dia = t.nextInt();
                        if (dia > 0 && dia <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("Dia inválido, digite novamente.");
                        }
                    }dia--;
                    horaValida = false;
                    hora = 0;
                    while (!horaValida) {
                        System.out.print("Digite a hora do compromisso: ");
                        hora = t.nextInt();
                        if (hora >= 0 & hora <= 24) {
                            horaValida = true;
                        }else{
                            System.out.println("Hora inválida, digite novamente.");
                        }
                    }
                    System.out.println("O compromisso para o mês "+mes+" dia "+dia+" às "+hora);
                    System.out.println(agenda[mes][dia][hora]);
                    break;
                case 3:
                    mesValido = false;
                    mes = 0;
                    while (!mesValido) {
                        System.out.print("Digite o mês do compromisso: ");
                        mes = t.nextInt();
                        if (mes > 0 && mes <= 12) {
                            mesValido = true;
                        } else {
                            System.out.println("Mês inválido, digite novamente.");
                        }
                    }
                    diaValido = false;
                    dia = 0;
                    while (!diaValido) {
                        System.out.print("Digite o dia do compromisso: ");
                        dia = t.nextInt();
                        if (dia > 0 && dia <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("Dia inválido, digite novamente.");
                        }
                    }dia--;
                    
                        for(int j = 0; j < agenda[mes][dia].length; j++){
                            if(!(agenda[mes][dia][j] == null)){
                                System.out.println(" compromisso: "+agenda[mes][dia][j]);
                            }
                        }
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opcao inválida, digite novamente.");
            }
        }
    }
}
