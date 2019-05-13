fun inArray(array1: Array<String>, array2: Array<String>): Array<String> {
    return array1.filter { str ->
        array2.firstOrNull { it.contains(str) } != null
    }.distinct().sorted().toTypedArray()
}