from unittest import TestCase

from parameterized import parameterized

from solutions.mathdsl import *


class TestMathDsl(TestCase):
    @parameterized.expand([
        (5, two(plus(three()))),
        (27, zero(plus(three(times(nine())))))
    ])
    def test_should_correctly_perform_calculations(self, expected, actual):
        self.assertEqual(expected, actual)

    def test_should_raise_arithmetic_error_when_dividing_by_zero(self):
        with self.assertRaises(ArithmeticError):
            two(divided_by(zero()))
