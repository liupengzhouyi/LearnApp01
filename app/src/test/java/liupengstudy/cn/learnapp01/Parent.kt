package liupengstudy.cn.learnapp01

//open： 代表开放，可以被继承
open class Parent(name: String) {
    //初始化成员属性
    private var name: String = name
    //主构造器
    init {
        this.name = name
        println("---Parent---")
        println(this.name)
    }

    //第二构造器
    //该构造器 跳用 第一构造器
    constructor(value : Int):this("liupeng") {
        println("-------------------------")
        println("使用第二构造器")
        println("name:liupeng")
        println("传入参数: " + value)
        println("-------------------------")
    }

    //第二构造器
    //该构造器 调用 第二构造器
    constructor() : this("20")
    fun testForField() {
        println("-------------------------")
        println("使用第二构造器")
        println("调用第二构造器")
        println("传入参数: " + "null")
        println("-------------------------")
    }

    //open 表示该方法可以被复写
    open fun getName() : String {
        return this.name
    }

}