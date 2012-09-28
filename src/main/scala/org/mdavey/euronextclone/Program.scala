package org.mdavey.euronextclone
import org.mdavey.euronextclone.ordertypes.Limit

object Program extends App {
	val l = new Limit{override val limit:Double = 22}
	Console.println(l.displayPrice(12))
	Console.println(l.limit)
}