import operator
import argparse


def keyword_cipher(text, keyword, alphabet='abcdefghijklmnopqrstuvwxyz ', decode=False):
    operators = {'+': operator.add, '-': operator.sub}

    # Only difference between encoding and decoding is
    # adding or subtracting the alphabet index and key index.
    if decode:
        op = operators['-']
    else:
        op = operators['+']

    keys = [alphabet.index(m) + 1 for m in keyword if m in alphabet]

    result = []
    for i, m in enumerate(text):
        if m in alphabet:
            result.append(
                alphabet[(op(alphabet.index(m), keys[i % len(keys)])) % (len(alphabet))])

    return result


def main():
    args = parseargs()
    text = ''.join(keyword_cipher(args.text, args.keyword, decode=args.decode))
    print(text)


def parseargs():
    parser = argparse.ArgumentParser(
        description='Cipher or decipher text with a keyword.')

    parser.add_argument('-d', '--decode', action='store_true',
                        dest='decode', default=False, required=False)
    parser.add_argument('-k', '--keyword', action='store',
                        dest='keyword', required=True)
    parser.add_argument('-t', '--text', action='store',
                        dest='text', required=True)

    return parser.parse_args()


if __name__ == '__main__':
    main()
