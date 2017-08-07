def main():
    with open('words.txt') as file:
        words = [word.strip() for word in file.readlines()]

    ordered_words = [word for word in words if is_ordered(word)]
    largest_length = len(max(ordered_words, key=len))
    largest_ordered_words = [word for word in ordered_words if len(word) == largest_length]
    print(', '.join(largest_ordered_words))

def is_ordered(word):
    return ''.join(sorted(word)) == word

if __name__ == '__main__':
    main()