# Inspired by r/dailyprogrammer
# https://www.reddit.com/r/dailyprogrammer/comments/5bn0b7/20161107_challenge_291_easy_goldilocks_bear/


def determine_acceptable_seats(path):
    with open(path, 'r') as data:
        weight, max_temperature = map(int, data.readline().split(" "))
        line_index = 1
        for line in data:
            max_weight, temperature = map(int, line.split(" "))
            if (max_weight > weight) and (max_temperature > temperature):
                yield line_index
            line_index += 1

if __name__ == "__main__":
    print(', '.join(str(x) for x in determine_acceptable_seats("seats.txt")))
