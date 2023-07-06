package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Atividades[] atividades;

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    String qty = scanner.nextLine();
    int qtyInt = Integer.parseInt(qty);

    atividades = new Atividades[qtyInt];

    for (int i = 1; i < qtyInt + 1; i += 1) {
      System.out.println("Digite o nome da atividade " + i);
      String atv = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + i);
      String peso = scanner.nextLine();
      int pesoInt = Integer.parseInt(peso);
      System.out.println("Digite a nota obtida para " + atv);
      String nota = scanner.nextLine();
      int notaInt = Integer.parseInt(nota);
      atividades[i - 1] = new Atividades(atv, pesoInt, notaInt);
    }

    int totalDividendo = 0;
    int totalDivisor = 0;

    for (int i = 0; i < qtyInt; i += 1) {
      totalDividendo += atividades[i].peso * atividades[i].nota;

      totalDivisor += atividades[i].peso;
    }

    float notaTotal = (float) totalDividendo / totalDivisor;

    if (notaTotal < 85) {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, "
          + notaTotal
          + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    } else  {
      System.out.printf("Parabéns! Você alcançou "
          + "%.1f%%! E temos o prazer de informar que você obteve aprovação! ", notaTotal);
    }
  }
}