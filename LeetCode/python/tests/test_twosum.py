from unittest import TestCase

from solutions.twosum import two_sum

valid_target_arguments = [
    ([0, 1], [2, 7, 9, 10], 9),
    ([1, 2], [2, 7, 9, 10], 16),
    ([0, 3], [2, 7, 9, 10], 12),
    ([2, 3], [2, 7, 9, 10], 19)
]

invalid_target_arguments = [
    (None, [0], -1),
    (None, [0, 1], 9)
]


class TestTwoSum(TestCase):
    def test_should_return_correct_indices(self):
        for expected, numbers, target in valid_target_arguments:
            with self.subTest():
                self.assertEqual(expected, two_sum(numbers, target))

    def test_should_raise_value_error_when_result_does_not_exist(self):
        for expected, numbers, target in invalid_target_arguments:
            with self.subTest():
                with self.assertRaises(ValueError):
                    two_sum(numbers, target)
