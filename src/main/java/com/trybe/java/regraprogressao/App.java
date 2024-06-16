package com.trybe.java.regraprogressao;

import java.util.ArrayList;
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
    ArrayList<EvaluativeActivity> evaluationsList = new ArrayList<>();

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int evaluationsQuantity = Integer.parseInt(scanner.nextLine());

    for (int index = 1; index <= evaluationsQuantity; index += 1) {
      EvaluativeActivity activity = new EvaluativeActivity();
      System.out.println("Digite o nome da atividade " + index + ":");
      activity.setEvaluationName(scanner.nextLine());
      System.out.println("Digite o peso da atividade " + index + ":");
      activity.setEvaluationWeight(Integer.parseInt(scanner.nextLine()));
      System.out.println("Digite a nota obtida para " + activity.getEvaluationName() + ":");
      activity.setEvaluationGrade(Integer.parseInt(scanner.nextLine()));

      evaluationsList.add(activity);
    }
    scanner.close();

    Evaluation evaluation = new Evaluation();
    boolean isValidWeightSum = evaluation.verifyEvaluationWeights(evaluationsList);
    if (!isValidWeightSum) {
      System.out.println("A soma dos pesos é diferente de 100!");
    } else {
      System.out.println(evaluation.evaluateGradesToPassOrFail(evaluationsList));
    }
  }
}