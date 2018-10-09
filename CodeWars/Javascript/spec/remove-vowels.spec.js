const removeVowels = require('../katas/remove-vowels');

describe('Remove vowels', () => {
    it('should return empty string when given string containing all vowels', () => {
        const result = removeVowels.removeVowels('aeiou');
        expect(result).toBe('');
    });

    it('should return the given string if it contains no vowels', () => {
        const result = removeVowels.removeVowels('n vwls n ths strng');
        expect(result).toBe('n vwls n ths strng');
    });

    it('should return empty string if given empty string', () => {
        const result = removeVowels.removeVowels('');
        expect(result).toBe('');
    });

    it('should return string with vowels correctly replaced with empty string', () => {
        const result = removeVowels.removeVowels('this is a test string');
        expect(result).toBe('ths s  tst strng');
    });
});