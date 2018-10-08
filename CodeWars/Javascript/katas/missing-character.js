module.exports = {
    missingLetter: function (letters) {
        var previous = letters[0].charCodeAt(0);
        for (var i = 1; i < letters.length; i++) {
            if (letters[i].charCodeAt(0) != previous + 1) {
                return String.fromCharCode(previous + 1);
            }

            previous = letters[i].charCodeAt(0);
        }

        // No missing character
        return '';
    }
};