module.exports = {

    // TODO: Figure out why the regex method was not able to work.
    // maskify: function (creditCard) {
    //     const regex = /^\d+(?= \d{4}$)/g;
    //     return creditCard.replace(regex, (match) => '#'.replace(match.length));
    // },

    maskify: function (creditCard) {
        const maskLength = creditCard.length - 4;
        const mask = '#'.repeat(maskLength > 0 ? maskLength : 0);
        const lastFour = creditCard.substring(maskLength)
        return `${mask}${lastFour}`;
    }
};