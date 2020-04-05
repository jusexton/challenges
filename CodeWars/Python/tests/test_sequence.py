from unittest import TestCase

from parameterized import parameterized

from solutions import sequence


class TestValidate(TestCase):
    @parameterized.expand([
        (True, [1, 2, 3]),
        (True, [10, 11, 12, 13, 14, 15, 16]),
        (True, [1, 3, 5, 7]),
        (True, [3, 6, 9, 12, 15]),
        (False, [11, 4, 2, 1]),
        (False, [12, 5, 34, 87, 13, 1, 5, 6, 7, 8, 12]),
        (False, [0, 1, 1, 2, 3, 5, 8, 13, 21, 34])
    ])
    def test_should_return_correct_when_given_certain_value(self, expected, values):
        # TODO: Figure out how to pass only a list object into expand.
        self.assertEqual(expected, sequence.validate(values))
