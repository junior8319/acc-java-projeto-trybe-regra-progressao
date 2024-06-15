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
   * Instantiates a new Evaluation.
   */
  public Evaluation() {
    this.weightsSum = 0;
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
}
