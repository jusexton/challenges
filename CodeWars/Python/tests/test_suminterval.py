from unittest import TestCase

from parameterized import parameterized

import solutions.sumintervals as sum_intervals


class TestSumOfInterval(TestCase):
    @parameterized.expand([
        (4, [(1, 5)]),
        (4, [(1, 5), (2, 3)])
    ])
    def test_should_return_correct_sum_of_intervals(self, expected, intervals):
        self.assertEqual(expected, sum_intervals.sum_of_intervals(intervals))
