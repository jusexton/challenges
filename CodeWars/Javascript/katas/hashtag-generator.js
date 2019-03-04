module.exports = {
    hashtagGenerator: (str) => {
        if (str === null || str.match(/^ *$/) !== null) {
            return false;
        }

        const words = str.split(/\s+/).map(word => {
            word = word.toLowerCase();
            return word.charAt(0).toUpperCase() + word.slice(1);
        });

        const hashtag = ['#', ...words].join('');

        return hashtag.length > 140 ? false : hashtag;
    }
}