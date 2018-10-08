module.exports = {
    digPow: function (n, p) {
        const result = n.toString().split('')
            .map(digit => Number(digit))
            .map((digit, index) => Math.pow(digit, p + index))
            .reduce((a, b) => a + b, 0);

        const k = result / n;
        return Number.isInteger(k) && k > 0 ? k : -1;
    }
};