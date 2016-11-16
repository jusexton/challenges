def main():
    kaprekar_numbers = find_in_range(100)
    print(', '.join(str(x) for x in kaprekar_numbers))
    kaprekar_numbers = find_in_range(minimum=101, maximum=9000)
    print(', '.join(str(x) for x in kaprekar_numbers))


def find_in_range(maximum, minimum=9):
    if maximum < 9:
        raise IndexError('Maximum must be greater than 9')

    kaprekar_numbers = []
    for i in range(minimum, maximum):
        if is_kaprekar(i):
            kaprekar_numbers.append(i)

    return kaprekar_numbers


def is_kaprekar(number):
    squared_int = pow(number, 2)
    squared_str = str(squared_int)
    first, second = squared_str[:int(len(squared_str) / 2)], squared_str[int(len(squared_str) / 2):]
    return int(first) + int(second) == number


if __name__ == '__main__':
    main()
