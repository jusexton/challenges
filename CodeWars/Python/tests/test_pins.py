from typing import List
from unittest import TestCase

from parameterized import parameterized

from solutions import pins


class TestObservedPin(TestCase):
    @parameterized.expand([
        (['5', '7', '8', '9', '0'], '8'),
        (['11', '22', '44', '12', '21', '14', '41', '24', '42'], '11'),
        (['339', '366', '399', '658', '636', '258', '268', '669', '668', '266', '369', '398', '256', '296', '259', '368', '638', '396',
          '238', '356', '659', '639', '666', '359', '336', '299', '338', '696', '269', '358', '656', '698', '699', '298', '236', '239'], '369')
    ])
    def test_should_return_all_possible_pins_from_observed_pin_number(self, expected: List[str], observed: str):
        sorted_expected = sorted(expected)
        sorted_actual = sorted(pins.get_pins(observed))

        self.assertEqual(sorted_expected, sorted_actual)
