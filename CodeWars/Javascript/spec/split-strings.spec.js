const splitStrings = require('../katas/split-strings');

describe('Split Strings', () => {
    it('should return empty array when given empty string.', () => {
        const result = splitStrings.splitStrings('');
        expect(result).toEqual([]);
    });

    it('should return string split into even chunks of two.', () => {
        const result = splitStrings.splitStrings('123456');
        expect(result).toEqual(['12', '34', '56']);
    });

    it('should return string split into even chunks with the last element having _ appended at the end.', () => {
        const result = splitStrings.splitStrings('12345');
        expect(result).toEqual(['12', '34', '5_']);
    });
});