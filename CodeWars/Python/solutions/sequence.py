def validate(sequence):
    return sum(sequence) == (sequence[0] + sequence[-1]) * len(sequence) / 2
