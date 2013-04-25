package dk.tennis.compare.rating.trueskill.rating

import dk.tennis.compare.rating.trueskill.model.TrueSkillRating
import dk.tennis.compare.rating.trueskill.model.Result

trait TrueSkill {

  def addResult(result:Result)

  /**
   * @return Map[playerName,playerSkill]
   */
  def getRatings(): Map[String, TrueSkillRating]

}