from unittest import TestCase

from parameterized import parameterized

import solutions.greed as greed


class TestCalculateScore(TestCase):
    @parameterized.expand([
        (0, []),
        (1200, [1, 1, 1, 1, 1]),
        (250, [5, 1, 3, 4, 1]),
        (450, [2, 4, 4, 5, 4]),
        (600, [6, 6, 6, 3, 3])
    ])
    def test_should_return_correctly_calculated_score(self, expected, dice):
        self.assertEqual(expected, greed.calculate_score(dice))
