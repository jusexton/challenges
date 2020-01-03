def is_prime(number: int) -> bool:
    if number <= 1:
        return False

    if number <= 3:
        return True

    if number % 2 == 0 or number % 3 == 0:
        return False

    index = 5
    while index * index <= number:
        if number % index == 0 or number % (index + 2) == 0:
            return False

        index += 6

    return True
