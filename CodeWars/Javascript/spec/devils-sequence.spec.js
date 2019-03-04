var sequence = require('../katas/devils-sequence');

describe('Devils sequence', () => {
    it('Should result in 3 when n is 10', () => {
        const result = sequence.devilsSequence(10);
        expect(result).toBe(3);
    });
});