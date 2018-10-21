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
        println(this.functionLearnWhen())
        this.functionLearnFor()

        println(Child("liupeng","liu……").getFunction())

        println("---------------------------------------------------------------------")

        var direction : Direction = Direction.SOUTH

        var direction1 : Direction = Direction.NORTH
        var direction2 : Direction = Direction.EAST
        var direction3 : Direction = Direction.SOUTH
        var direction4 : Direction = Direction.WEST

        if (direction.equals(direction3)) {
            println("枚举类型相同")
        } else {
            println("枚举类型不同")
        }

        for (d in Direction.values()) {
            println(d)
        }
        println("---------------------------------------------------------------------")

        //数据类
        var user1 : User = User("liupeng", 21)
        var user2 : User = User("liupeng", 21)

        println(user1)
        println(user2)
        //调用toString(), toString()调用hashcode(), 前面加上"类名@"

        println(user1.equals(user2))
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

        var numberI : Int = 10
        var numberII : Int = 30

        //If-else语句块作为 表达式
        number = if (numberI > numberII) {
            numberI
        } else {
            numberII
        }

        return number
    }

    fun functionLearnWhen() : String {

        var number : Int = 100

        var string : String = ""

        when(number) {
            100 -> {
                string = "number = 100"
            }
            200 -> {
                string = "number = 200"
            }
            else -> {
                string = "number != 100 and number != 200"
            }
        }

        return string
    }

    fun functionLearnFor() {
        var arrays = intArrayOf(2,4,6,8,7,5,3)

        for (i : Int in arrays) {
            println(i)
        }
    }
}

