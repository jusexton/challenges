const alphPosition = require('../katas/alphabet-position');

describe('Alphabet position', () => {
    it('should replace all characters in a given string with their position in the alphabet', () => {
        let result = alphPosition.alphabetPosition('The sunset sets at twelve o\' clock.');
        expect(result).toBe('20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11');

        result = alphPosition.alphabetPosition('The narwhal bacons at midnight.');
        expect(result).toBe('20 8 5 14 1 18 23 8 1 12 2 1 3 15 14 19 1 20 13 9 4 14 9 7 8 20');
    });
});