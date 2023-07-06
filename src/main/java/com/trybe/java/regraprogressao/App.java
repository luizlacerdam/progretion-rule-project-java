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

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    String qty = scanner.next();
    int qtyInt = Integer.parseInt(qty);

    for(int i = 1; i < qtyInt; i += 1) {
      System.out.println("Digite o nome da atividade " + i);
      String atv = scanner.next();
      System.out.println("Digite o peso da atividade " + i);
      String peso = scanner.next();
      int pesoInt = Integer.parseInt(peso);

    }

  }
}