const next = require('../katas/next-biggest');

describe('Next biggest', () => {
    it('should return the next biggest number', () => {
        let nextBiggest = next.nextBiggest(12);
        expect(nextBiggest).toBe(21);

        nextBiggest = next.nextBiggest(513);
        expect(nextBiggest).toBe(531);

        nextBiggest = next.nextBiggest(2017);
        expect(nextBiggest).toBe(2071);

        nextBiggest = next.nextBiggest(534976);
        expect(nextBiggest).toBe(536479);

        nextBiggest = next.nextBiggest(890);
        expect(nextBiggest).toBe(908);

        nextBiggest = next.nextBiggest(59853);
        expect(nextBiggest).toBe(83559);

        nextBiggest = next.nextBiggest(1234567890);
        expect(nextBiggest).toBe(1234567908);

        nextBiggest = next.nextBiggest(59884848459853);
        expect(nextBiggest).toBe(59884848483559);
    });

    it('should return -1 if it is not possible to construct a greater number', () => {
        let nextBiggest = next.nextBiggest(9);
        expect(nextBiggest).toBe(-1);

        nextBiggest = next.nextBiggest(111);
        expect(nextBiggest).toBe(-1);

        nextBiggest = next.nextBiggest(531);
        expect(nextBiggest).toBe(-1);
    });
});