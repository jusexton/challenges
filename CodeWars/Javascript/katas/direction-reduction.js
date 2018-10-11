module.exports = {
    directionalReduction: function (directions) {
        const removed = directions.join(' ')
            .replace(/(NORTH SOUTH)|(SOUTH NORTH)|(EAST WEST)|(WEST EAST)/g, '')
            .split(' ')
            .filter(direction => direction);

        return removed.length === directions.length ? removed : this.directionalReduction(removed);
    }
};