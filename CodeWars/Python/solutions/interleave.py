from typing import List

from itertools import chain, zip_longest


def interleave_lists(*args: List) -> List:
    interleaved = []

    if len(args) == 1:
        return args[0]

    max_index = max(map(lambda l: len(l), args))

    for index in range(0, max_index):
        for arg in args:
            try:
                interleaved.append(arg[index])
            except IndexError:
                interleaved.append(None)

    return interleaved


def interleave_lists_optimized(*args: List) -> List:
    return list(chain.from_iterable(zip_longest(*args)))
