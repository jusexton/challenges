from typing import Dict, List


def two_sum(numbers: List[int], target: int) -> List[int]:
    compliment_map: Dict[int, int] = dict()
    for index in range(0, len(numbers)):
        number = numbers[index]
        compliment = target - number
        if compliment in compliment_map:
            return [compliment_map[compliment], index]

        compliment_map[number] = index

    raise ValueError('Given numbers does not contain the specified target')
