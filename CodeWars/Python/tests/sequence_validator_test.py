import pytest
from challenges.sequence_validator import *

valid_sequences = [
    [1, 2, 3],
    [10, 11, 12, 13, 14, 15, 16],
    [1, 3, 5, 7],
    [3, 6, 9, 12, 15]
]

invalid_sequences = [
    [11, 4, 2, 1],
    [12, 5, 34, 87, 13, 1, 5, 6, 7, 8, 12],
    [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
]


@pytest.mark.parametrize("sequence", valid_sequences)
def test_numbers_that_increment_with_same_pattern(sequence):
    assert validate_sequence(sequence) is True


@pytest.mark.parametrize('sequence', invalid_sequences)
def test_numbers_that_do_not_increment_with_same_pattern(sequence):
    assert validate_sequence(sequence) is False
