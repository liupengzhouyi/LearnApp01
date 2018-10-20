package liupengstudy.cn.learnapp01

import org.junit.Test

import org.junit.Assert.*
import kotlin.math.max
import kotlin.math.min

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)

        this.functionToAssignment()
        println(this.functionToIfElse())
    }

    fun function() : Int {
        //Kotlin 新的字符串，保留原格式
        var string : String = """
                www.ww ww
            w,w111111，     11
        """
        println(string)
        return 0
    }

    fun functionToAssignment() : String {
        var number : Int = 10
        //assignment
        var string : String = "number = $number"
        println(string)
        return string
    }

    fun functionToIfElse() : String {

        var numberA : Int = 10

        var numberB = 30

        var maxNumber : Int = 0

        if (numberA > numberB) maxNumber = numberA

        var minNumber : Int

        if (numberA > numberB) {
            minNumber = numberB
        } else {
            minNumber = numberA
        }

        return "mixNumber : $minNumber ,maxNumber : $maxNumber"
    }

    //在kotlin中，if-else 可以当作赋值代码快
    fun functionToAssignmentByIfElse() : Int {
        var number : Int = 0


        return number
    }
}
