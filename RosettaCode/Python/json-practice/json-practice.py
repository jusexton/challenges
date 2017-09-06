import json


class Person(object):
    def __init__(self, name, age):
        self.name = name
        self.age = age


def main():
    person = Person("Test Person", 20)
    serialized = json.dumps(person.__dict__, sort_keys=True, indent=4)

    with open('test-person.json', 'w') as json_file:
        json_file.write(serialized)


if __name__ == '__main__':
    main()
