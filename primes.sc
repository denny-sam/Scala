// 90 - days Coding challenge
//coded by Vipul Vaibhaw

object primes {
	def main(args: Array[String]){
  def isPrime(n: Int) = (2 until n) forall (n % _ != 0)
  for (i <- 2 to 100 if isPrime(i)) println(i)
}
}