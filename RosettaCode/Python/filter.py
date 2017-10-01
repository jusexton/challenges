def main():
    values = range(10)
    evens = (str(value) for value in values if value % 2 == 0)
    print(','.join(evens))

if __name__ == '__main__':
    main()