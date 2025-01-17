fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() % 2 == 0) {
            iterator.remove()
        }
    }
    println(list) // Output: [1, 3, 5]

    val map = mutableMapOf<String, Int>("a" to 1, "b" to 2, "c" to 3)
    val mapIterator = map.iterator()
    while (mapIterator.hasNext()) {
        val entry = mapIterator.next()
        if (entry.value % 2 == 0) {
            mapIterator.remove()
        }
    }
    println(map) // Output: {a=1, c=3}
} 