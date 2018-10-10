import java.util.*

// More kotlin like version
fun generateColor(random: Random) =
        (1..3).joinToString("", "#") { random.nextInt(256).toString(16).padStart(2, '0') }

// More java like version
//fun generateColor(random: Random): String =
//        '#' + random.ints(6, 0, 16)
//                .mapToObj { it.toString(16) }
//                .collect(Collectors.joining(""))


