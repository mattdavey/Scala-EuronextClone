package org.mdavey.euronextclone

trait OrderType {
	def acceptsMarketPrice() : Boolean

    def providesLimit() : Boolean

    def getLimit() : Double

    def canPegLimit() : Boolean

    def convertsToLimit() : Boolean

    def price(side : OrderSide.Value, bestLimit : Double) : Double

    def displayPrice(price : Double) : String
}