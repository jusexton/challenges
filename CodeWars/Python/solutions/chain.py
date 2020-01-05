from __future__ import annotations


def add(number: int) -> ChainAbleAdd:
    return ChainAbleAdd(number)


class ChainAbleAdd(int):
    def __call__(self, value):
        return ChainAbleAdd(self + value)
