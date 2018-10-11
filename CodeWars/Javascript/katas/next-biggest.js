module.exports = {
    nextBiggest: (number) => {
        const digits = number.toString().split('').map(character => Number(character));

        let i;
        for (i = digits.length - 1; i > 0; i--) {
            if (digits[i] > digits[i - 1]) {
                break;
            }
        }

        if (i === 0) {
            return -1;
        }

        let min = i;
        for (let j = i + 1; j < digits.length; j++) {
            if (digits[j] > digits[i - 1] && digits[j] < digits[min]) {
                min = j;
            }
        }

        const temp = digits[i - 1];
        digits[i - 1] = digits[min];
        digits[min] = temp;

        const sortedEnd = digits.slice(i, digits.length).sort();
        return Number(digits.slice(0, i).concat(sortedEnd).join(''));
    }
};