const stringIncrementer = require('../katas/string-incrementer');

describe('String Incrementer', () => {
    it('Should add one to end if no number is found', () => {
        const result = stringIncrementer.incrmentString('htr');
        const expected = 'htr1';
        expect(result).toBe(expected);
    });

    it('Should parse number at end of given string and increment by one', () => {
        expect(stringIncrementer.incrmentString('test123')).toBe('test124');
        expect(stringIncrementer.incrmentString('test1230456')).toBe('test1230457');
    });

    it('Should ignore leading zeroes', () => {
        expect(stringIncrementer.incrmentString('test00123')).toBe('test00124');
        expect(stringIncrementer.incrmentString('test0012003')).toBe('test0012004');
    });

    it('Should carry over to leading zero if increment increases digit count.', () => {
        expect(stringIncrementer.incrmentString('test099')).toBe('test100');
    });

    it('Should increment zero if only zeroes at end of given string', () => {
        expect(stringIncrementer.incrmentString('test000')).toBe('test001');
    });
});