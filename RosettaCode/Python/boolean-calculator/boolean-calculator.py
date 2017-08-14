from itertools import product
import sys

def caluclate_and_display(expression):
    code = compile(expression, '<string>', 'eval')
    variables = code.co_names
    print(f'{" ".join(variables)} : {expression}')
    for values in product(range(2), repeat=len(variables)):
        env = dict(zip(variables, values))
        print(f'{" ".join(str(value) for value in values)} : {eval(code, env)}')

if __name__ == '__main__':
    for expression in sys.argv[1:]:
        caluclate_and_display(expression)
