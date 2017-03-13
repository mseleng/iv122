package com.github.mseleng.iv122.assignment2

import com.github.mseleng.iv122.util.factorial
import com.github.mseleng.iv122.util.pow
import com.github.mseleng.iv122.util.sqrt_approx_bisection

/**
 * @suppress
 */
fun run(args: Array<String>) {
    //A
    val input = listOf(1, 2, 3, 4, 5)
    val k = 3
    val n = input.size
    println("-> Input: $input; k: $k")
    println("-> Permutations:")
    val permutations = permutations(input)
    println("\tSize is: ${permutations.size}. Should be: ${n.factorial()}")
    println("\t$permutations")
    println("-> Combinations without repetition:")
    val combinationsWithoutRep = combinations(input, k, false)
    println("\tSize is: ${combinationsWithoutRep.size}. Should be: ${n.factorial().div((n.minus(k).factorial()).times(k.factorial()))}")
    println("\t$combinationsWithoutRep")
    println("-> Combinations with repetition:")
    val combinationsWithRep = combinations(input, k, true)
    println("\tSize is: ${combinationsWithRep.size}. Should be: ${n.plus(k).minus(1).factorial().div((n.minus(1).factorial()).times(k.factorial()))}")
    println("\t$combinationsWithRep")
    println("-> Variations without repetition:")
    val variationsWithoutRep = variations(input, k, false)
    println("\tSize is: ${variationsWithoutRep.size}. Should be: ${n.factorial().div((n.minus(k).factorial()))}")
    println("\t$variationsWithoutRep")
    println("-> Variations with repetition:")
    val variationsWithRep = variations(input, k, true)
    println("\tSize is: ${variationsWithRep.size}. Should be: ${n.pow(k)}")
    println("\t$variationsWithRep\n==========")

    //B

    //C
    println("-> √2 = 2^0.5 = ${rationalPower_1(2.0, 0.5)}; Library value = ${Math.pow(2.0, 0.5)}")
    println("-> √3 = 3^0.5 = ${rationalPower_1(3.0, 0.5)}; Library value = ${Math.pow(3.0, 0.5)}")
    println("-> 3^3.14 = ${rationalPower_1(3.0, 3.14)}; Library value = ${Math.pow(3.0, 3.14)}")
    println("-> 2^3 = ${rationalPower_1(2.0, 3.0)}; Library value = ${Math.pow(2.0, 3.0)}\n==========")
//    println("*************************")
//    println(rationalPower_2(2.0, 3.0))
//    println(rationalPower_2(3.0, 0.5))
//    println(rationalPower_2(3.0, 3.14))

    //D
    val interval = 3000L
    println("-> π approximation within $interval ms:")
    println("-> The library value of π: ${Math.PI}")
//    println("\tMonte Carlo method (using the approximated square root): ${pi_MonteCarlo(interval, Double::square, { sqrt_approx_bisection(it) })}")
    println("\tMonte Carlo method (using the library square (root) function): ${pi_MonteCarlo(interval, { Math.pow(it, 2.0) }, Math::sqrt)}")
    println("\tGregory-Leibnitz method: ${pi_GregoryLeibniz(interval)}")
    println("\tArchimedes' method (using the approximated square root): ${pi_Archimedes(interval, { sqrt_approx_bisection(it) })}")
    println("\tArchimedes' method (using the library square root function): ${pi_Archimedes(interval, Math::sqrt)}")
}
