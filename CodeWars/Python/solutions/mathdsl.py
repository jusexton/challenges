def zero(operator=None):
    return 0 if operator is None else operator(0)


def one(operator=None):
    return 1 if operator is None else operator(1)


def two(operator=None):
    return 2 if operator is None else operator(2)


def three(operator=None):
    return 3 if operator is None else operator(3)


def four(operator=None):
    return 4 if operator is None else operator(4)


def five(operator=None):
    return 5 if operator is None else operator(5)


def six(operator=None):
    return 6 if operator is None else operator(6)


def seven(operator=None):
    return 7 if operator is None else operator(7)


def eight(operator=None):
    return 8 if operator is None else operator(8)


def nine(operator=None):
    return 9 if operator is None else operator(9)


def plus(number):
    return lambda a: a + number


def minus(number):
    return lambda a: a - number


def times(number):
    return lambda a: a * number


def divided_by(number):
    if number == 0:
        raise ArithmeticError('Can not divide by zero')

    return lambda a: a // number
