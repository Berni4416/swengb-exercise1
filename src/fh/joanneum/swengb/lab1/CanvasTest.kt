package fh.joanneum.swengb.lab1

import org.junit.Test

import org.junit.Assert.*

class CanvasTest {

    @Test
    fun getTotalArea() {
        val canvas = Canvas()
        canvas.addShape(Rectangle("white", width = 5.0, length = 2.0))
        canvas.addShape(Circle("red", radius = 1.0))

        assertEquals(13.142, canvas.getTotalArea(), 0.001)
    }
}