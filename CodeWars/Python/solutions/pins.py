import functools
import itertools
from typing import List


def get_pins(observed: str) -> List[str]:
    return [''.join(p) for p in itertools.product(*(_potential_numbers(d) for d in observed))]


MAPPING = {
    '1': ['1', '2', '4'],
    '2': ['1', '2', '3', '5'],
    '3': ['2', '3', '6'],
    '4': ['1', '4', '5', '7'],
    '5': ['2', '4', '5', '6', '8'],
    '6': ['3', '5', '6', '9'],
    '7': ['4', '7', '8'],
    '8': ['5', '7', '8', '9', '0'],
    '9': ['6', '8', '9'],
    '0': ['0', '8']
}


def _potential_numbers(character: str) -> List[str]:
    if character not in MAPPING:
        raise ValueError(f'Unsupported character: {character}')

    return MAPPING[character]
