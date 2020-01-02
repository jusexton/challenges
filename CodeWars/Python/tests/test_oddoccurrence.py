from unittest import TestCase

from parameterized import parameterized

from solutions.oddoccurrence import odd_occurrence


class TestOddOccurrence(TestCase):
    @parameterized.expand([
        (2, [1, 2, 2, 2, 1]),
        (5, [20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5]),
        (-1, [1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5])
    ])
    def test_should_return_the_int_that_occurs_an_odd_number_of_times_in_the_sequence(self, expected, values):
        self.assertEqual(expected, odd_occurrence(values))
