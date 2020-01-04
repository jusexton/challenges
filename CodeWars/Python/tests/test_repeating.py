from unittest import TestCase

from parameterized import parameterized

import solutions.repeating as repeating


class TestFirstNonRepeating(TestCase):
    @parameterized.expand([
        ('', ''),
        ('e', 'test'),
        ('h', 'hello'),
        ('c', 'code wars'),
        (',', 'Go hang a salami, I\'m a lasagna hog!'),
        ('T', 'sTreSS')
    ])
    def test_should_return_the_first_non_repeating_character(self, expected, string):
        self.assertEqual(expected, repeating.first_non_repeating_letter(string))

    @parameterized.expand([
        ('TT',),
        ('testtest',)
    ])
    def test_should_return_empty_string_when_all_characters_repeat(self, string):
        self.assertEqual('', repeating.first_non_repeating_letter(string))
