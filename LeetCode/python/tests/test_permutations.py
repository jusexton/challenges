from unittest import TestCase

from parameterized import parameterized

from solutions.permutations import permute


class TestPermutations(TestCase):
    @parameterized.expand(
        [([[1, 2, 3],
           [1, 3, 2],
           [2, 1, 3],
           [2, 3, 1],
           [3, 1, 2],
           [3, 2, 1]], [1, 2, 3])]
    )
    def test_should_return_all_permutations(self, expected, numbers):
        for expected_permutation, actual_permutation in zip(expected, permute(numbers)):
            self.assertListEqual(list(expected_permutation),
                                 list(actual_permutation))
