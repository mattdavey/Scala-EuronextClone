package org.mdavey.euronextclone
import org.mdavey.euronextclone.ordertypes.Limit
import org.specs2.mutable._
import org.junit._

@Test
class LimitSpec extends SpecificationWithJUnit {
  
	"A Limit" should { 
	  
	  "allow a price to be set" in {
		val l = new Limit{override val limit:Double = 22.0}
		assert(l.limit === 22.0)
	  }
	}
}