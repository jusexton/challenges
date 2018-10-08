var removeMin = require('../katas/remove-minimum');

describe('Remove first minimum value', () => {
    it('should return [2, 3]', () => {
        const result = removeMin.removeMinimum([1, 2, 3]);
        expect(result).toEqual([2, 3]);
    });
});