import csv
from collections import defaultdict


class Employee:
    def __init__(self, id, name, salary, department):
        self.id = id
        self.name = name
        self.salary = salary
        self.department = department

    def __str__(self):
        return '{0}, {1}, {2}, {3}'.format(self.id, self.name, self.salary, self.department)


class EmployeeLoader:
    @staticmethod
    def load(filepath):
        employees = []
        with open(filepath) as employee_file:
            csv_reader = csv.DictReader(employee_file)
            for line in csv_reader:
                employees.append(Employee(line['id'], line['name'], int(
                    line['salary']), line['department']))

        return employees


def calculate_top_salarys(employees, limit):
    employees.sort(key=lambda employee: employee.salary, reverse=True)

    departments = defaultdict(list)
    for employee in employees:
        if len(departments[employee.department]) < limit:
            departments[employee.department].append(employee)

    return departments


def main():
    results = calculate_top_salarys(EmployeeLoader.load('employees.csv'), 2)
    for key in results:
        print('Department {0}----------'.format(key))
        for employee in results[key]:
            print('Id:{0}, Name:{1}, Salary:{2}'.format(
                employee.id, employee.name, employee.salary))


if __name__ == '__main__':
    main()
