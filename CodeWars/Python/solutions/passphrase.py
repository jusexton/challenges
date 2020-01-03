from string import ascii_lowercase as LOWERCASE_ALPHABET
from typing import Dict, Optional


def convert(string: str, offset: int) -> str:
    passphrase = []
    translation_table = str.maketrans(LOWERCASE_ALPHABET, LOWERCASE_ALPHABET[offset:] + LOWERCASE_ALPHABET[:offset])
    for index, character in enumerate(string):
        if character.isalpha():
            new_character = _convert_character(character, translation_table, index)
            passphrase.append(new_character)
        elif character.isdigit():
            complement_digit = _complement(character)
            passphrase.append(str(complement_digit))
        else:
            passphrase.append(character)

    return ''.join(reversed(passphrase))


def _complement(number: int) -> int:
    return 9 - int(number)


def _convert_character(character: str, translation_table: Dict[int, Optional[int]], index: int) -> str:
    translated_character = character.lower().translate(translation_table)
    return translated_character.upper() if index % 2 == 0 else translated_character.lower()
