def main():
    with open('words.txt') as file:
        words = [word.strip() for word in file.readlines()]

    ordered_words = list(
        filter(lambda x: is_ordered(x), words))
    largest_length = len(max(ordered_words, key=len))
    largest_ordered_words = list(
        filter(lambda x: len(x) == largest_length, ordered_words))
    print(', '.join(largest_ordered_words))


def is_ordered(word):
    return ''.join(sorted(word)) == word


if __name__ == '__main__':
    main()
