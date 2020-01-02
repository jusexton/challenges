import sys

ROMAN_TO_INT_TABLE = {
    'I': 1,
    'V': 5,
    'X': 10,
    'L': 50,
    'C': 100,
    'D': 500,
    'M': 1000,
}

ROMAN_NUMERAL_TABLE = [
    ('M', 1000), ('CM', 900), ('D', 500),
    ('CD', 400), ('C', 100), ('XC', 90),
    ('L', 50), ('XL', 40), ('X', 10),
    ('IX', 9), ('V', 5), ('IV', 4),
    ('I', 1)
]


def roman_value(roman_character: chr) -> int:
    try:
        return ROMAN_TO_INT_TABLE[roman_character]
    except KeyError:
        raise ValueError('Given character was not a valid roman character')


def from_roman(roman_string: str) -> int:
    result = 0
    last_value = sys.maxsize
    for character in roman_string:
        value = roman_value(character)

        if value > last_value:
            result += value - 2 * last_value
        else:
            result += value

        last_value = value

    return result


def to_roman(number: int) -> str:
    if number < 1:
        raise ValueError('Given value must be greater than zero')

    roman_numerals = []
    for numeral, int_value in ROMAN_NUMERAL_TABLE:
        count = number // int_value
        number -= count * int_value
        roman_numerals.append(numeral * count)

    return ''.join(roman_numerals)
