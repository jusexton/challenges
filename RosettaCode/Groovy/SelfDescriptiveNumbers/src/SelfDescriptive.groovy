import java.util.stream.IntStream

// Time: Approximately 60 seconds
IntStream.rangeClosed(0, 100_000_000)
        .parallel()
        .filter { i -> isSelfDescriptive(i) }
        .forEach { i -> println(i) }

static boolean isSelfDescriptive(final int value) {
    List<Integer> digits = new ArrayList<>()
    // Collects digits and reverses them.
    int number = value
    while (number > 0) {
        digits.add(number % 10)
        number /= 10
    }
    Collections.reverse(digits)

    // Performs self descriptive check on collected digits.
    for (int i = 0; i < digits.size(); i++) {
        int digit = digits.get(i)
        int count = 0
        for (int j = 0; j < digits.size(); j++) {
            int temp = digits.get(j)
            if (temp == i) {
                count++
            }
            if (count > digit) {
                return false
            }
        }
        if (count != digit) {
            return false
        }
    }
    return true
}
