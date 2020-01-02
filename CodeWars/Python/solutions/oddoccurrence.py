from typing import List


def odd_occurrence(values: List[int]) -> int:
    number_frequencies = {}

    for value in values:
        occurrence = number_frequencies.get(value, 0) + 1
        number_frequencies[value] = occurrence

    for key, value in number_frequencies.items():
        if value % 2 == 1:
            return key
