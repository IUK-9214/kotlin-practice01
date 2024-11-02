import java.util.Scanner
import kotlin.math.sqrt

fun main() {
val scanner = Scanner(System.`in`)
    println("Enter the number A :")
    val a = scanner.nextDouble()
    println("Enter the number B :")
    val b = scanner.nextDouble()
    println("Enter the number C :")
    val c = scanner.nextDouble()
    println("Your number A is : $a and B is : $b and C is : $c")
    println("The Sum of these number is " )
    val sum:Double=a+b+c
    println(sum)
    println("The quadratic formula is :")
    val disc:Double= b*b-4*a*c
    val discroot:Double=sqrt(disc)
    if (discroot<0){
        println("it is imaginary number ")
    }
    else {

        val resultp: Double = (-b - disc) / (2 * a)
        val resultn: Double = (-b + disc) / (2 * a)
    println("your result: $resultp")
        println("your result: $resultn")
    }
}