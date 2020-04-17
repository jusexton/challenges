from itertools import permutations
from typing import Iterable, List, Tuple


def permute(numbers: List[int]) -> Iterable[Tuple[int, ...]]:
    return permutations(numbers)
