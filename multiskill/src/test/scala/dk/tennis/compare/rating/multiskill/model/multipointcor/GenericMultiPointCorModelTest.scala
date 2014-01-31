package dk.tennis.compare.rating.multiskill.model.multipointcor

import org.junit._
import Assert._
import dk.tennis.compare.rating.multiskill.testutil.MultiSkillTestUtil._
import dk.tennis.compare.rating.multiskill.model.multipoint.GenericMultiPointModel
import dk.tennis.compare.rating.multiskill.domain.PlayerSkill

class GenericMultiPointCorModelTest {

  @Test def skill_covariance_is_zero {

    val p1Skill = PlayerSkill(-1, 1)
    val p2Skill = PlayerSkill(0.5, 1.2)

    val p1PerfVariance = 190
    val p2PerfVariance = 170

    val model = GenericMultiPointCorModel(p1PerfVariance, p2PerfVariance)

    val (newP1Skill, newP2Skill, covariance) = model.skillMarginals(p1Skill, p2Skill, 7400, 10000, skillCovariance = 0)

    assertPlayerSkill(PlayerSkill(5.0527, 0.0613), newP1Skill, 0.0001)
    assertPlayerSkill(PlayerSkill(-6.7624, 0.0620), newP2Skill, 0.0001)

    assertEquals(0.45546, covariance, 0.00001)
  }
}