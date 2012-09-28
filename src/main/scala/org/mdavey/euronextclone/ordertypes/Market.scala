package org.mdavey.euronextclone.ordertypes
import org.mdavey.euronextclone.OrderSide
import java.text.DecimalFormat
import org.mdavey.euronextclone.OrderType


class Market extends OrderType {
    def acceptsMarketPrice() : Boolean = {
        true
    }

    def providesLimit() : Boolean = {
        false
    }

    def getLimit() : Double = {
        throw new RuntimeException("Market orders do not provide limit");
    }

    def canPegLimit() : Boolean = {
        false
    }

    def convertsToLimit() : Boolean = {
        false
    }

    def price(side : OrderSide.Value, bestLimit : Double) : Double = {
      0
    }

    def displayPrice(price : Double) : String = {
        "MO"
    }
}