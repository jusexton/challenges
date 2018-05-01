fun main(args: Array<String>) {
    val stack = Stack<Int>()
    println(stack.empty) // true
    stack.pushRange(5, 4, 3, 1, 6, 5, 4, 3)
    println(stack.top) // 3
    println(stack.size) // 8
    println(stack.empty)// false
    println(stack.pop()) // 3
    println(stack.size) // 7
}