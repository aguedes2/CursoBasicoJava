/**
 * Exercício 4
 * Faça um programa para armazenar em uma matriz os compromissos de uma
 * agenda pessoal. Cada dia do mês deve conter 24 horas, onde para cada
 * uma destas 24 horas podemos associar um tarefa específica
 * (compromisso agendado). O programa deve ter um menu onde o usuário
 * indica o dia do mês que deseja alterar e a hora, entrando em seguida
 * com o compromisso, ou então, o usuário pode também consultar a agenda,
 * fornecendo o dia e a hora para obter o compromisso armazenado.
 */
package com.cursobasicojava.aula20.exercicios;

import java.util.Scanner;

/**
 *
 * @author fernando
 */
public class exe04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] compromisso = new String[31][24];
        boolean sair = false;
        byte opcao;
        while (!sair) {
            System.out.println("Digite 1 para adicionar compromisso");
            System.out.println("Digite 2 para verificar compromisso");
            System.out.println("Digite 3 para verificar os compromissos de um dia");
            System.out.println("Digite 0 para sair");

            opcao = scan.nextByte();

            if (opcao == 1) { // add compromisso

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.print("Entre com o dia do mês: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente.");
                    }
                }
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.print("Entre com a hora do compromisso:");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente.");
                    }
                }
                System.out.println("Digite o compromisso para o dia " + dia + " às " + hora);
                compromisso[--dia][hora] = scan.next();

            } else if (opcao == 2) { //verificar compromisso
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.print("Entre com o dia do mês: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, digite novamente.");
                    }
                }
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.print("Entre com a hora do compromisso:");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente.");
                    }
                }

                System.out.println("O compromisso agendado é:");
                System.out.println(compromisso[--dia][hora]);
            } else if (opcao == 3) {
                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.print("Digite o dia: ");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                        dia--;
                        for (int i = 0; i < compromisso[dia].length; i++) {
                            if (!(compromisso[dia][i] == null)) {
                                System.out.println(compromisso[dia][i] + "  ");
                            }
                        }
                    } else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opção inválida! Digite novamente.");
            }

        }
    }
}
