package dk.tennis.compare.rating.multiskill.model.perfdiff

import dk.bayes.math.gaussian.Gaussian
import dk.bayes.math.linear.Matrix

trait PerfDiff {

    /**
   * Returns perf diffs for all games,
   *
   */
  def inferPerfDiffs():Array[Gaussian]
  
  /**
   * Returns Tuple3(
   * - Perf diffs for all games,
   * - Partial derivatives for the mean of the game performance difference with respect to some hyper parameters
   * - Partial derivatives for the variance of the game performance difference with respect to some hyper parameters
   * )
   */
  def inferPerfDiffsWithD(): Tuple3[Array[Gaussian], Matrix, Matrix]

}