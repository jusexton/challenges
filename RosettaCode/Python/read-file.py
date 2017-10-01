import sys

with open(sys.argv[1]) as file:
    print(file.read().strip)
