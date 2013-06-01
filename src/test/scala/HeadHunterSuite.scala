import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

class HeadHunterSuite extends WordSpec with ShouldMatchers {
  "HeadHunter" should {
    "be type safe and therefore awesome" in {
      import HeadHunter._
      val t1:Option[Int] = get(Seq(1,2,3))
      t1 should equal (Some(1))
      
      val t2:(Option[String], Option[Int]) = get(Seq("strs","str2"), Seq(4,5,6)) 
      t2 should equal ((Some("strs"),Some(4)))
      
      val t3:(Option[Boolean], Option[String], Option[Int]) = get(Seq(true,false,true), Seq("str1","str2"), Seq(3)) 
      t3 should equal ((Some(true), Some("str1"), Some(3)))
    }
  }
}