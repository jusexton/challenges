class Stack<T> {
    private val items = mutableListOf<T>()

    val size get() = items.size

    val empty get() = size == 0

    val top: T
        get() {
            if (size == 0) throw ArrayIndexOutOfBoundsException("No elements exist within stack")
            return items.last()
        }

    fun push(item: T) = items.add(item)

    fun pushRange(vararg items: T) = this.items.addAll(items)

    fun pop(): T {
        if (size == 0) throw ArrayIndexOutOfBoundsException("No elements exist within stack")
        return items.removeAt(items.lastIndex)
    }

    fun clear() = items.clear()
}