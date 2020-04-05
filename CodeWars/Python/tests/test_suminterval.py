from unittest import TestCase

from parameterized import parameterized

from solutions import sumintervals


class TestSumOfInterval(TestCase):
    @parameterized.expand([
        (4, [(1, 5)]),
        (4, [(1, 5), (2, 3)])
    ])
    def test_should_return_correct_sum_of_intervals(self, expected, intervals):
        self.assertEqual(expected, sumintervals.sum_of_intervals(intervals))
