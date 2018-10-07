var creditCards = require('../katas/credit-card-mask');

describe('Credit card maskify', () => {
    it('should mask everything before the last 4 characters', () => {
        const input = '0124321234';
        const expected = '######1234';
        const maskedCreditCard = creditCards.maskify(input);
        expect(maskedCreditCard).toBe(expected, `Should be ${expected} but was ${maskedCreditCard}`);
    });

    it('should not need to mask the given card', () => {
        const input = '1234';
        const expected = '1234';
        const maskedCreditCard = creditCards.maskify(input);
        expect(maskedCreditCard).toBe(expected, `Should be ${expected} but was ${maskedCreditCard}`);
    });
});