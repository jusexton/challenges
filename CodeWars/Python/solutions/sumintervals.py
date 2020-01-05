from typing import List, Tuple


def sum_of_intervals(intervals: List[Tuple[int, int]]) -> int:
    numbers = []

    for interval in intervals:
        for index in range(interval[0], interval[1]):
            numbers.append(index)

    return len(set(numbers))
