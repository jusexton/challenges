module.exports = {
    createIterator: (values) => {
        return new Iterator(values);
    }
}

// Not a very good way of doing this in javascript.

class Iterator {
    constructor(values) {
        this.index = 0;
        this.values = values;

        // If values is empty we are already done iterating.
        this.done = this.values.length === 0;
    }

    next() {
        if (this.done) {
            return { value: undefined, done: true };
        }

        const next = { value: this.values[this.index++], done: false };
        this.done = this.index === this.values.length;

        return next;
    }
}