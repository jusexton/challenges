from unittest import TestCase

from parameterized import parameterized

from solutions import prime


class TestIsPrime(TestCase):
    @parameterized.expand([
        (2,),
        (3,),
        (5,),
        (7,),
        (11,),
        (13,),
        (17,),
        (23,)
    ])
    def test_should_return_true_when_given_prime_number(self, number):
        self.assertTrue(prime.is_prime(number))

    @parameterized.expand([
        (-1,),
        (4,),
        (6,)
    ])
    def test_should_return_false_when_given_prime_number(self, number):
        self.assertFalse(prime.is_prime(number))
