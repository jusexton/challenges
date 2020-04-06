// 🤨
module.exports = {
    maskify: function (creditCard) {
        return creditCard.replace(/.(?=....)/g, '#');
    }

    // Old version
    // maskify: function (creditCard) {
    //     const maskLength = creditCard.length - 4;
    //     const mask = '#'.repeat(maskLength > 0 ? maskLength : 0);
    //     const lastFour = creditCard.substring(maskLength)
    //     return `${mask}${lastFour}`;
    // }
};
