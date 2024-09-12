package my.demo
import kotlin.math.abs
fun convertDouble(a: Int): Double {
    return a.toDouble()
}
fun convertDouble2Int(a: Double): Int {
    return a.toInt()
}
fun convertString2Int(a: String): Int {
    return a.toInt()
}
fun primeCheck(a: Int): Boolean {
    var w = 2.0
    var i = 1
    while (i < a) {
        if (a.toDouble() != w) {
            val aOverW: Double = a / w
            val intAOverW = convertDouble2Int(aOverW)
            val doubleIntAOverW = convertDouble(intAOverW)
            if (abs(aOverW-intAOverW) < 0.00000001) {
                return false
            }
        }
        w += 1
        i += 1
    }
    return true
}
fun main() {
        println("This Kotlin program outputs primes from 2 to the maximum")
        println("Enter a maximum")
        val mVar: String = readln()
        val maxVar = convertString2Int(mVar)
        var limitVar = 2
        while (limitVar<=maxVar) {
            val z = primeCheck(limitVar)
            if (z) {
                println(limitVar)
            }
            limitVar += 1
        }
    }
