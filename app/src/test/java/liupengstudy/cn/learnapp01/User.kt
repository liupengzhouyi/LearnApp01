package liupengstudy.cn.learnapp01

class User(name: String, age: Int) {
    var name: String = name
    var age: Int = age

    override fun equals(other: Any?): Boolean {
        if (other is User) {
            if (this.name == other.name && this.age == other.age) {
                return true
            }
        } else {
            return false
        }
        return false
    }

    override fun toString(): String {
        return "name:" + this.name + ", age:" + this.age
    }
}
