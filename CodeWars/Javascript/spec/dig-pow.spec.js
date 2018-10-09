const dig = require('../katas/dig-pow');

describe('Dig pow', () => {
    it('should return 1 when given 89 and 1', () => {
        const result = dig.digPow(89, 1);
        expect(result).toBe(1);
    });

    it('should return -1 when given 92 and 1', () => {
        const result = dig.digPow(92, 1);
        expect(result).toBe(-1);
    });

    it('should return 2 when given 695 and 2', () => {
        const result = dig.digPow(695, 2);
        expect(result).toBe(2);
    });

    it('should return 51 when given 46288 and 3', () => {
        const result = dig.digPow(46288, 3);
        expect(result).toBe(51);
    });
});