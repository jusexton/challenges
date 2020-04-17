from collections import namedtuple
from typing import Sequence

PartitionMinMax = namedtuple(typename='PartitionMinMax', field_names=['max_left', 'min_right'])


def median_of_merged_lists(array_one: Sequence[int], array_two: Sequence[int]) -> float:
    # Make sure larger array is on the right
    if len(array_one) > len(array_two):
        array_one, array_two = array_two, array_one

    array_one_count = len(array_one)
    array_two_count = len(array_two)

    low = 0
    high = array_one_count

    while low <= high:
        # Integer division because these values are used for indexing
        partition_x = (low + high) // 2
        partition_y = (array_one_count + array_two_count + 1) // 2 - partition_x

        (x_max_left, x_min_right) = _acquire_min_max(array_one, partition_x)
        (y_max_left, y_min_right) = _acquire_min_max(array_two, partition_y)

        if x_max_left <= y_min_right and x_min_right >= y_max_left:
            if (array_one_count + array_two_count) % 2 == 0:
                partitions_max_left = max(x_max_left, y_max_left)
                partitions_min_right = min(x_min_right, y_min_right)
                return (partitions_max_left + partitions_min_right) / 2.0
            else:
                return max(x_max_left, y_max_left)
        elif x_max_left > y_min_right:
            high = partition_x - 1
        else:
            low = partition_x + 1


def _acquire_min_max(array: Sequence[int], partition: int) -> PartitionMinMax:
    max_left = array[partition - 1] if partition > 0 else float('-inf')
    min_right = float('inf') if partition == len(array) else array[partition]

    return PartitionMinMax(max_left=max_left, min_right=min_right)
