import os
import random
from time import sleep


def get_settings(difficulty='e'):
    difficulty = difficulty.lower()
    if difficulty == 'e':
        return random.sample(range(10), 2), 5
    elif difficulty == 'm':
        return random.sample(range(100), 3), 10
    elif difficulty == 'h':
        return random.sample(range(1000), 4), 12
    else:
        raise ValueError('Unsupported difficulty')


def memorized_correctly(generated, given):
    if len(generated) != len(given):
        return False

    for i in range(len(generated)):
        if generated[i] != given[i]:
            return False

    return True


def main():
    random_numbers, seconds = get_settings(input('Difficulty[e|m|h]: '))
    os.system('cls' if os.name == 'nt' else 'clear')

    # Input to halt the execution.
    input(f'You will have {seconds} seconds to memorize the numbers. Press any key when ready...')
    str_random_numbers = ', '.join(list(map(str, random_numbers)))
    print(str_random_numbers)
    sleep(seconds)
    os.system('cls' if os.name == 'nt' else 'clear')

    given_numbers = list(map(int, input('Numbers(space separated): ').split(' ')))
    if memorized_correctly(random_numbers, given_numbers):
        print('You did it !')
    else:
        print('Better luck next time')
        print(f'Actual numbers were: {str_random_numbers}')


if __name__ == '__main__':
    main()
