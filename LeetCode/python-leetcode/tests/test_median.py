from typing import Sequence

import pytest

from solutions.median import median_of_merged_lists


@pytest.mark.parametrize('array_one, array_two, expected', [
    ([1, 2], [3, 4], 2.5),
    ([1, 2], [3], 2),
    ([1, 2, 9, 12], [3, 4, 10, 16, 19], 9)
])
def test_should(array_one: Sequence[int], array_two: Sequence[int], expected: float):
    result = median_of_merged_lists(array_one, array_two)
    assert result == expected
