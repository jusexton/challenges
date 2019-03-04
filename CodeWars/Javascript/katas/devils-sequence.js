module.exports = {
    devilsSequence: (n) => {
        // Function is required inorder to perform recursive call.
        function sequence(n) {
            if (n === 0 || n === 1) {
                return n;
            }

            return (sequence(n - 1) + sequence(n - 2)) / 2;
        }

        const result = sequence(n);
        const afterDecimal = result.toString().slice(2);
        return afterDecimal.match(/(6+)(?=.*)/)[0].length;

    }
};