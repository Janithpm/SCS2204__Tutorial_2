//Question 1 ,2
var k, i, j = 2
var m, n = 5
var f = 12.0f
var g = 4.0f
var c = 'X'
//----------------------------------------------------------------------------

//Question 3 part I

//a)
k + 12 * m

//b)
m / j

//c)
n % j

//d)
m / j * j

//e)
f + 10 * 5 + g

//f)
i = i + 1
i * n


//---------------------------------------------------------------------------

//question 3 part II

var a = 2
var b = 3
var c = 4
var d = 5
var k = 4.3f

//a)
b = b - 1
println(b * a + c * d)
d = d - 1

//b)
println(a)
a = a + 1

//c)
println(-2 * (g - k) + c)

//d)
println(c)
c = c + 1

//e)
c = c + 1
println(c * a)
a = a + 1
//-----------------------------------------------------------------------------------------------

//Question 4 part a
val salaryForWorkingHour = 250.00f
val salaryForOTHour = 85.00f
val typicalWorkingHoursPerWeek = 40
val typicalOTHoursPerWeek = 30
val taxRate = 0.12f

def IsValid(workingHours: Int, otHours: Int): Boolean = workingHours >= typicalWorkingHoursPerWeek && otHours >= typicalOTHoursPerWeek
def TotalSalary(workingHours: Int, otHours: Int): Float = (workingHours * salaryForWorkingHour) + (otHours * salaryForOTHour)
def Tax(totalSalary: Float): Float = totalSalary * taxRate
def TakeHomeSalary(totalSalary: Float, tax: Float) : Float = totalSalary - tax

def CalculateSalary(workingHours: Int, otHours: Int) : Float = if (IsValid(workingHours, otHours)) {
  val totalSalary = TotalSalary(workingHours, otHours)
  val tax = Tax(totalSalary)
  TakeHomeSalary(totalSalary, tax)
} else {
  println("Working Hours and OT hours should be greater than or equal to threshold\n")
  0
}

CalculateSalary(60, 60)

//----------------------------------------------------------------------------------------------------------------------

//Question 4 part b
val costForEachPerformance = 500.00f
val costForEachAttendee = 3.00f
val basePrice = 15.00f
val priceChange = 5

def NumberOfPeople(priceChange: Int): Int = -1 * (priceChange * 20 / 5) + 120
def TicketPrice(priceChange: Int): Float = basePrice + priceChange
def Income(numberOfPeople: Int, ticketPrice: Float): Float = ticketPrice * numberOfPeople
def Cost(numberOfPeople: Int): Float = costForEachPerformance + (costForEachAttendee * numberOfPeople)
def Profit(income: Float, cost: Float): Float = income - cost
def CalculateProfit(numberOfPeople: Int, ticketPrice: Float) : Float = Profit(Income(numberOfPeople, ticketPrice), Cost(numberOfPeople))

def FindBestPrice(priceIncrese: Int, priceDecrese: Int): Float = {
  val numberOfPeople_increased = NumberOfPeople(priceIncrese)
  val ticketPrice_increased = TicketPrice(priceIncrese)
  val profit_increased = CalculateProfit(numberOfPeople_increased, ticketPrice_increased)

  val numberOfPeople_decreased = NumberOfPeople(priceDecrese)
  val ticketPrice_decreased = TicketPrice(priceDecrese)
  val profit_decreased = CalculateProfit(numberOfPeople_decreased, ticketPrice_decreased)

  if(profit_increased >= profit_decreased) ticketPrice_increased else ticketPrice_decreased
}

FindBestPrice(5, -5)

