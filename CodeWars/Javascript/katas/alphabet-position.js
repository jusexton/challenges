module.exports = {
    alphabetPosition: (str) => {
        return str.replace(/[^a-zA-Z]/g, "").toLowerCase().split('')
            .map(character => character.charCodeAt(0) - 96)
            .join(' ');
    }
};