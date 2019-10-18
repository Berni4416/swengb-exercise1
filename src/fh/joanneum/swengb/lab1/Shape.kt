package fh.joanneum.swengb.lab1



fun main() {
    val testShape = Shape()
    println(testShape.color) //black
    val circle1 = Circle(radius = 10.0, color = "red")
    val circle2 = Circle(radius = 10.0, color = "red")
    println(circle1===circle2)
    println(setOf<Circle>(circle1, circle2).size)
    println(circle1==circle2)
    val canvas = Canvas()
    canvas.addShape(Rectangle("white", width = 5.0, length = 2.0))
    canvas.addShape(Circle("red", radius = 1.0))
    println(canvas.getTotalArea()) //  13.14
}

open class Shape(val color:String = "black") {
    open fun getArea():Double {
        return 0.0
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shape) return false

        if (color != other.color) return false

        return true
    }

    override fun hashCode(): Int {
        return color.hashCode()
    }

}

class Rectangle(color:String = "black", val width:Double = 1.0, val length:Double = 1.0): Shape(color){
    override fun getArea(): Double {
        return width * length

    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rectangle) return false
        if (!super.equals(other)) return false

        if (width != other.width) return false
        if (length != other.length) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + width.hashCode()
        result = 31 * result + length.hashCode()
        return result
    }

}






