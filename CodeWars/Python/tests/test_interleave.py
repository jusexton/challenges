from unittest import TestCase

from parameterized import parameterized

from solutions import interleave


class TestInterleaveLists(TestCase):
    @parameterized.expand([
        ([], []),
        ([1, 2, 3], [1, 2, 3]),
        ([1, 2], [1], [2]),
        ([1, 2, 3], [1], [2], [3]),
        ([1, "c", 2, "d", 3, "e"], [1, 2, 3], ["c", "d", "e"]),
        ([1, 2, 3, 4, None, None], [1, 4], [2], [3])
    ])
    def test_should_return_values_from_each_arg_correctly_interleaved(self, expected, *args):
        self.assertListEqual(expected, interleave.interleave_lists(*args))
        self.assertListEqual(
            expected, interleave.interleave_lists_optimized(*args))
