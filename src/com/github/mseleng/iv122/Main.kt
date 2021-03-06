package com.github.mseleng.iv122

/**
 * @suppress
 */
fun main(args: Array<String>) {
    val path = args.getOrElse(0) { "iv122_outputs" }
    println("IV122")
    println("Output directory: $path/\n\n")
    println("***The first assignment***")
    com.github.mseleng.iv122.assignment1.run(path)
    println("Complete.\n\n***The second assignment***")
    com.github.mseleng.iv122.assignment2.run(path)
    println("Complete.\n\n***The third assignment***")
    com.github.mseleng.iv122.assignment3.run(path)
    println("Complete.\n\n***The fourth assignment***")
    com.github.mseleng.iv122.assignment4.run(path)
    println("Complete.\n\n***The fifth assignment***")
    com.github.mseleng.iv122.assignment5.run(path)
    println("Complete.\n\n***The sixth assignment***")
    com.github.mseleng.iv122.assignment6.run(path)
    println("Complete.\n\n***The seventh assignment***")
    com.github.mseleng.iv122.assignment7.run(path)
    println("Complete.\n\n***The eight assignment***")
    com.github.mseleng.iv122.assignment8.run(path)
    println("Complete.\n\n***The tenth assignment***")
    com.github.mseleng.iv122.assignment10.run(path)
    println("Complete.\n\n***The eleventh assignment***")
    com.github.mseleng.iv122.assignment11.run(path)
    println("Complete.\n\n***The twelfth assignment***")
    com.github.mseleng.iv122.assignment12.run(path)
    println("Complete.\n\n***The thirteenth assignment***")
    com.github.mseleng.iv122.assignment13.run(path)
    println("Complete.\n")
}
