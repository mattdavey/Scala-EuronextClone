package org.mdavey.euronextclone.ordertypes
import org.mdavey.euronextclone.OrderSide
import java.text.DecimalFormat
import org.mdavey.euronextclone.OrderType

class Limit extends OrderType {
    val limit:Double = 0
  
	override def acceptsMarketPrice() : Boolean = {
		false
    }

    def providesLimit() : Boolean = {
      true
    }

    def getLimit() : Double = {
      limit
    }

    def canPegLimit() : Boolean = {
      false
    }

    def convertsToLimit() : Boolean = {
      false
    }

    def price(side : OrderSide.Value, bestLimit : Double) : Double = {
      limit
    }

    def displayPrice(price : Double) : String = {
      new DecimalFormat("#.##").format(price)
    }
}