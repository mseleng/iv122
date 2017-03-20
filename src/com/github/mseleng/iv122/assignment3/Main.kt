package com.github.mseleng.iv122.assignment3

import com.github.mseleng.iv122.util.Coordinates
import com.github.mseleng.iv122.util.SVG
import com.github.mseleng.iv122.util.fileWithName

/**
 * @suppress
 */
fun run(path: String) {
    //A
    print("-> Polygon (7 edges)......")
    SVG().lines(polygon(7, 200)).writeTo(fileWithName(path, 3, "polygon7.svg"))
    print(" ✓ (assignment3/polygon7.svg)\n-> Polygon (9 edges)......")
    SVG().lines(polygon(9, 200)).writeTo(fileWithName(path, 3, "polygon9.svg"))
    print(" ✓ (assignment3/polygon9.svg)\n-> Polygon (17 edges)......")
    SVG().lines(polygon(17, 100)).writeTo(fileWithName(path, 3, "polygon17.svg"))
    print(" ✓ (assignment3/polygon17.svg)\n-> Multistar (9 vertices)......")
    SVG().lines(multistar(9, 80)).writeTo(fileWithName(path, 3, "multistar9.svg"))
    print(" ✓ (assignment3/multistar9.svg)\n-> Multistar (5 vertices)......")
    SVG().lines(multistar(5, 80)).writeTo(fileWithName(path, 3, "multistar5.svg"))
    println(" ✓ (assignment3/multistar5.svg)")

    //B
    print("-> Pentagram (turtle)......")
    SVG().lines(anygram_turtle(5, 100)).writeTo(fileWithName(path, 3, "pentagram_turtle.svg"))
    print(" ✓ (assignment3/pentagram_turtle.svg)\n-> 79gram (turtle)......")
    SVG(10000, 10000).lines(anygram_turtle(79, 100)).writeTo(fileWithName(path, 3, "79gram_turtle.svg"))
    print(" ✓ (assignment3/79gram_turtle.svg)\n-> Nested square (20;[1:3];5])......")
    SVG().lines(nestedSquare(200.0, Coordinates(30, 30), 20, Pair(1, 3), 5)).writeTo(fileWithName(path, 3, "nestedsquare.svg"))
    print(" ✓ (assignment3/nestedsquare.svg)\n-> Nested square (40;[1:7];5])......")
    SVG().lines(nestedSquare(300.0, Coordinates(30, 30), 40, Pair(1, 7), 5)).writeTo(fileWithName(path, 3, "nestedsquare2.svg"))
    print(" ✓ (assignment3/nestedsquare2.svg)\n-> Nested square (40;[1:10];0])......")
    SVG().lines(nestedSquare(300.0, Coordinates(30, 30), 40, Pair(1, 10), 0)).writeTo(fileWithName(path, 3, "nestedsquare3.svg"))
    print(" ✓ (assignment3/nestedsquare3.svg)\n-> Nested triangle ([25;5])......")
    SVG().lines(nestedTriangle(500.0, Coordinates(270, 0), 25, 5)).writeTo(fileWithName(path, 3, "nestedTriangle2.svg"))
    print(" ✓ (assignment3/nestedTriangle2.svg)\n-> Nested triangle ([25;0])......")
    SVG().lines(nestedTriangle(500.0, Coordinates(270, 0), 25, 0)).writeTo(fileWithName(path, 3, "nestedTriangle.svg"))
    print(" ✓ (assignment3/nestedTriangle.svg)\n-> Rounded flower.....")
    SVG(1000, 1000).lines(flower(100, Coordinates(300, 10))).writeTo(fileWithName(path, 3, "flower.svg"))
    print(" ✓ (assignment3/flower.svg)\n")

    //C
    print("-> Branch fractal......")
    SVG().lines(branch(12)).writeTo(fileWithName(path, 3, "branch.svg"))
    print(" ✓ (assignment3/branch.svg)\n")

    //D
}
