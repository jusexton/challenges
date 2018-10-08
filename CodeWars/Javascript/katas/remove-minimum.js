module.exports = {
    removeMinimum: function (numbers) {
        const minIndex = numbers.indexOf(Math.min(...numbers));
        return numbers.filter((number, index) => index != minIndex);
    }
};