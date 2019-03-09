const iteratorCreation = require('../katas/iterator');

const testValues = ['one', 'two', 'three'];
const iterator = iteratorCreation.createIterator(testValues);

describe('Iterator', () => {
    it('Should correctly update index and return correct next object', () => {
        expect(iterator.index).toEqual(0);

        expect(iterator.next()).toEqual({ value: 'one', done: false });
        expect(iterator.index).toEqual(1);

        expect(iterator.next()).toEqual({ value: 'two', done: false });
        expect(iterator.index).toEqual(2);

        expect(iterator.next()).toEqual({ value: 'three', done: false });
        expect(iterator.index).toEqual(3);

        expect(iterator.next()).toEqual({ value: undefined, done: true });
        expect(iterator.index).toEqual(3);
    });
});