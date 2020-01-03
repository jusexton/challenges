def multiple_of_five(number: int) -> int:
    return multiple_of_n(number, 5)


def multiple_of_n(number: int, base: int) -> int:
    return number if number % base == 0 else number + base - number % base
