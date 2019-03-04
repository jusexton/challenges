var generator = require('../katas/hashtag-generator');

describe('Hashtag generator', () => {
    it('Should return false if input is null, empty or whitespace.', () => {
        [null, '', '        '].map(i => generator.hashtagGenerator(i)).forEach(output => expect(output).toBeFalsy())
    });

    it('Should return false if output string length is greater than 140.', () => {
        const result = generator.hashtagGenerator('a'.repeat(140));
        expect(result).toBeFalsy();
    });

    it('Should return the correct hashtag given a string of words.', () => {
        let result = generator.hashtagGenerator('helLo ThERe');
        expect(result).toBe('#HelloThere');

        result = generator.hashtagGenerator('Test ing A Hash tAg');
        expect(result).toBe('#TestIngAHashTag')
    });
});