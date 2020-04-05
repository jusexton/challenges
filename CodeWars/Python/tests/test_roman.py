from unittest import TestCase

from parameterized import parameterized

from solutions import roman


class TestFromRoman(TestCase):
    @parameterized.expand([
        (1, 'I'),
        (4, 'IV'),
        (5, 'V'),
        (6, 'VI'),
        (1776, 'MDCCLXXVI'),
        (2014, 'MMXIV')
    ])
    def test_should_correctly_convert_roman_string_to_int(self, expected, roman_string):
        self.assertEqual(expected, roman.from_roman(roman_string))

    @parameterized.expand([
        'abc',
        'not valid'
    ])
    def test_should_raise_value_error_when_roman_string_is_invalid(self, invalid_roman_string):
        with self.assertRaises(ValueError):
            roman.from_roman(invalid_roman_string)


class TestToRoman(TestCase):
    @parameterized.expand([
        ('I', 1),
        ('V', 5),
        ('MCMLXXXIX', 1989)
    ])
    def test_should_correctly_convert_roman_string_to_int(self, expected, int_value):
        self.assertEqual(expected, roman.to_roman(int_value))

    @parameterized.expand([
        (0,),
        (-1,),
        (-100,)
    ])
    def test_should_raise_value_error_when_int_value_is_less_than_one(self, int_value):
        with self.assertRaises(ValueError):
            roman.to_roman(int_value)
