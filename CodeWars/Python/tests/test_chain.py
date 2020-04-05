from unittest import TestCase

from parameterized import parameterized

from solutions import chain


class TestChainAdd(TestCase):
    @parameterized.expand([
        (0, chain.add(0)),
        (5, chain.add(2)(3)),
        (25, chain.add(2)(3)(20))
    ])
    def test_should_correctly_chain_and_add_given_values(self, expected, actual):
        self.assertEqual(expected, actual)
