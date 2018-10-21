package liupengstudy.cn.learnapp01

//继承
class Child(parentName : String, name : String) : Parent(parentName) {
    private var myName : String = name
    init {
        println("---Child---")
        println(this.myName)
    }

    public fun getFunction() {
        super.getName()
    }

    //复写方法
    override fun getName(): String {
        return this.myName
    }

    //只读属性
    val number : Int
        get() = 100

    //读写属性
    var string : String
        get() = string
        set(value) {
            string = value
        }

    //方法的默认参数
    fun printHello(name : String = "liupeng") {
        println("Hello! " + name)
    }

}
