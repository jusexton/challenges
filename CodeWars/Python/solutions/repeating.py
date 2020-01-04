from collections import Counter


def first_non_repeating_letter(string):
    letter_count_table = Counter(string.lower())
    for letter in string:
        if letter_count_table[letter.lower()] == 1:
            return letter

    return ''
