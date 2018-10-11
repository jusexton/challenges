const panagrams = require('../katas/panagrams');

describe('Is Panagram', () => {
    it('should return true when given strings that contain all characters a-z', () => {
        const result = panagrams.isPanagram('The quick brown fox jumps over the lazy dog.');
        expect(result).toBe(true);
    });

    it('should return false when given strings that do not contain all characters a-z', () => {
        const result = panagrams.isPanagram('This is not a pangram.');
        expect(result).toBe(false);
    });
});