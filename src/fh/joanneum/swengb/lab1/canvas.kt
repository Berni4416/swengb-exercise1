package fh.joanneum.swengb.lab1

class Square(
    color: String = "black",
    val side: Double = 1.0
) : Shape(color) {
    override fun getArea(): Double {
        return side * side
    }
}


// first collab!!!! :D