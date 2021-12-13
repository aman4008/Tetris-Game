package com.example.tetris

internal class Coordinate(var y: Int, var x: Int) {
    companion object {
        fun add(A: Coordinate, B: Coordinate): Coordinate {
            return Coordinate(A.y + B.y, A.x + B.x)
        }

        fun sub(A: Coordinate, B: Coordinate): Coordinate {
            return Coordinate(A.y - B.y, A.x - B.x)
        }

        fun rotateAntiClock(X: Coordinate): Coordinate {
            return Coordinate(-X.x, X.y)
        }

        fun isEqual(A: Coordinate, B: Coordinate): Boolean {
            return A.y == B.y && A.x == B.x
        }
    }
}