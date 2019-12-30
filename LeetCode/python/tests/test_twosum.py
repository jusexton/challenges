from unittest import TestCase

from parameterized import parameterized

from solutions.twosum import two_sum


class TestTwoSum(TestCase):
    @parameterized.expand([
        ([0, 1], [2, 7, 9, 10], 9),
        ([1, 2], [2, 7, 9, 10], 16),
        ([0, 3], [2, 7, 9, 10], 12),
        ([2, 3], [2, 7, 9, 10], 19)
    ])
    def test_should_return_correct_indices(self, expected, numbers, target):
        self.assertListEqual(expected, two_sum(numbers, target))

    @parameterized.expand([
        (None, [0], -1),
        (None, [0, 1], 9)
    ])
    def test_should_raise_value_error_when_result_does_not_exist(self, expected, numbers, target):
        with self.assertRaises(ValueError):
            two_sum(numbers, target)
