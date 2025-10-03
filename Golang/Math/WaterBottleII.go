func maxWaterBottles(numBottles, numExchange int)int  {
	empty := numBottles
	for empty >= numExchange{
		empty -= numExchange
		numBottles += 1
		numExchange += 1
		empty += 1
	}
	return numBottles
}