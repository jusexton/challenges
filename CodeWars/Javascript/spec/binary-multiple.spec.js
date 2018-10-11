const mulitple = require('../katas/binary-multiple');

describe('Binary multiple of 3 regex', () => {
    it('should return true if the given binary is divisble by 3 and false if not.', () => {
        let result = mulitple.multipleOf3Regex.test('000');
        expect(result).toBe(true);

        result = mulitple.multipleOf3Regex.test('001');
        expect(result).toBe(false);

        result = mulitple.multipleOf3Regex.test('011');
        expect(result).toBe(true);

        result = mulitple.multipleOf3Regex.test('110');
        expect(result).toBe(true);

        result = mulitple.multipleOf3Regex.test(' ');
        expect(result).toBe(false);

        result = mulitple.multipleOf3Regex.test('abc');
        expect(result).toBe(false);
    });
});