module.exports = {
    // splitStrings: (value) => {
    //     const splits = value.match(/.{1,2}/g);

    //     if (value.length % 2 == 1) {
    //         const splitCount = splits.length - 1;
    //         splits[splitCount] = splits[splitCount] + '_';
    //     }

    //     return splits ? splits : [];
    // }

    splitStrings: (value) => {
        const result = (value.length % 2 == 0 ? value : value + '_').match(/../g);
        return result ? result : [];
    }
}