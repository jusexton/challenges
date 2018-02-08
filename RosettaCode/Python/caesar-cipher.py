import sys


def caesar_cipher(text, offset):
    key = 'abcdefghijklmnopqrstuvwxyz'
    result = []

    for c in text:
        try:
            index = key.index(c)
            result.append(key[(index + offset) % 26])
        except ValueError:
            result.append(c)

    return result


def main():
    plain_text = sys.argv[1]
    offset = int(sys.argv[2])
    cipher_text = ''.join(caesar_cipher(plain_text, offset))
    print(cipher_text)


if __name__ == '__main__':
    main()
