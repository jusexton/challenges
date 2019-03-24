module.exports = {
    incrmentString: (str) => {
        // 0 is the match
        // 1 is leading zeroes
        // 2 is the valid tail number
        const match = str.match(/([0]+)?([1-9][0-9]*)?$/)
        const leadingString = str.replace(match[0], '');

        const increment = match[2] ? parseInt(match[2]) + 1 : 1;
        const zeroes = match[1] ?
            !match[2] || increment.toString().length > match[2].length ? match[1].slice(0, -1) : match[1] : '';

        return `${leadingString}${zeroes}${increment}`;
    }
};