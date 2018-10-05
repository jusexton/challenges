fun countRedBeads(blueBeadCount: Int): Int = when {
    blueBeadCount < 2 -> 0
    else -> (blueBeadCount - 2) + blueBeadCount
}