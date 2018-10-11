module.exports = {
    isPanagram: (str) => {
        return new Set(str.replace(/[^a-zA-Z]/g, '').toLowerCase()).size === 26;
    }
};