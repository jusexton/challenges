from unittest import TestCase

from parameterized import parameterized

from solutions import rounding


class TestRounding(TestCase):
    @parameterized.expand([
        (0, 0),
        (25, 22),
        (30, 30)
    ])
    def test_should_return_the_next_multiple_of_five(self, expected, number):
        self.assertEqual(expected, rounding.multiple_of_five(number))
