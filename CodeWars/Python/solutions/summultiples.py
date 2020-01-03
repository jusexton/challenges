def sum_multiples(number: int) -> int:
    return sum(filter(lambda n: n % 3 == 0 or n % 5 == 0, range(0, number + 1)))
