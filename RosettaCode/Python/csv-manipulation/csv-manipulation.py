import csv


def main():
    with open('csv-data.txt', 'r') as csv_file:
        csv_reader = csv.DictReader(csv_file)

        with open('new-csv-data.txt', 'w') as new_file:
            fieldnames = ['col1', 'col2', 'col3', 'col4']
            csv_writer = csv.DictWriter(new_file, fieldnames=fieldnames)
            csv_writer.writeheader()

            for line in csv_reader:
                del line['col5']
                csv_writer.writerow(line)


if __name__ == '__main__':
    main()
