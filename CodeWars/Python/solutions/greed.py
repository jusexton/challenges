from collections import Counter
from typing import List

TRIPLE_SCORE_TABLE = {
    1: 1000,
    2: 200,
    3: 300,
    4: 400,
    5: 500,
    6: 600
}

SINGLE_SCORE_TABLE = {
    1: 100,
    5: 50
}


def calculate_score(dice: List[int]) -> int:
    dice_count = Counter(dice)

    score = 0
    for dice_number, roll_count in dice_count.items():
        score += _sum_dice_number_score(dice_number, roll_count)

    return score


def _sum_dice_number_score(dice_number, roll_count):
    score = 0

    while roll_count >= 3:
        score += TRIPLE_SCORE_TABLE[dice_number]
        roll_count -= 3

    if dice_number in (1, 5):
        while roll_count != 0:
            score += SINGLE_SCORE_TABLE[dice_number]
            roll_count -= 1

    return score
