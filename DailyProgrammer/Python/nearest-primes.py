import math

def main():
    test_numbers = [270, 541, 993, 649, 2010741]
    for number in test_numbers:
        if is_prime(number):
            print(f'{number} is prime.')
        else: 
            lower = get_closest_prime(number, inc='b')        
            greater = get_closest_prime(number)  
            print(f'{lower} < {number} < {greater}')

def get_closest_prime(number, inc='f'):
    if inc == 'f':
        increment = 2
    elif inc == 'b':
        increment = -2
    else:
        raise ValueError

    if number % 2 == 0:
        possible_prime = number + 1
    else:
        possible_prime = number

    while not is_prime(possible_prime):
        possible_prime = possible_prime + increment

    return possible_prime

def is_prime(number):
    if number % 2 == 0 and number >= 2 or number <= 1: 
        return False
    return all(number % i for i in range(2, int(math.sqrt(number)) + 1))

if __name__ == '__main__':
    main()