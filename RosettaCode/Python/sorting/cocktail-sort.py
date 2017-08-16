def cocktail_sort(array):
    index_range = range(len(array) - 1)
    while True:
        if not _cocktail_sort_helper(array, index_range):
            return
        if not _cocktail_sort_helper(array, reversed(index_range)):
            return


def _cocktail_sort_helper(array, index_range):
    swapped = False
    for i in index_range:
        if array[i] > array[i + 1]:
            array[i], array[i + 1] = array[i + 1], array[i]
            swapped = True
    return swapped


if __name__ == '__main__':
    test_integers = [5, 1, 4, 2, 0, 8, 2, 1, 4, 10, 5, 2, 3, 1, 9, 6]
    cocktail_sort(test_integers)
    print('Cocktail Sort: {0}'.format(test_integers))
