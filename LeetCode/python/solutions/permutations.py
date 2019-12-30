from itertools import permutations
from typing import List, Iterable


def permute(numbers: List[int]) -> Iterable[int]:
    return permutations(numbers)
