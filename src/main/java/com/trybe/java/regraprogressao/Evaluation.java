package com.trybe.java.regraprogressao;

import java.util.ArrayList;

/**
 * The type Evaluation.
 */
public class Evaluation {

  /**
   * The Weights sum.
   */
  int weightsSum;

  /**
   * The Final grade.
   */
  double finalGrade;

  /**
   * Instantiates a new Evaluation.
   */
  public Evaluation() {
    this.weightsSum = 0;
    this.finalGrade = 0d;
  }

  /**
   * Verify evaluation weights boolean.
   *
   * @param activities the activities
   * @return the boolean
   */
  public boolean verifyEvaluationWeights(ArrayList<EvaluativeActivity> activities) {
    for (EvaluativeActivity activity: activities) {
      this.weightsSum += activity.getEvaluationWeight();
    }
    return this.weightsSum == 100;
  }

  /**
   * Evaluate grades to pass or fail string.
   *
   * @param activities the activities
   * @return the string
   */
  public String evaluateGradesToPassOrFail(ArrayList<EvaluativeActivity> activities) {
    for (EvaluativeActivity activity: activities) {
      this.finalGrade += activity.getEvaluationGrade() * activity.getEvaluationWeight();
    }
    this.finalGrade = this.finalGrade / 100;

    if (this.finalGrade >= 85) {
      return "Parabéns! Você alcançou " + this.finalGrade
          + "%! E temos o prazer de informar que você obteve aprovação!";
    } else {
      return "Lamentamos informar que, com base na sua pontuação alcançada neste período, "
          + this.finalGrade + "% , você não atingiu a pontuação"
          + " mínima necessária para sua aprovação.\n";
    }
  }
}
