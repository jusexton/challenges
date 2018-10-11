const dirReduction = require('../katas/direction-reduction');

describe('Directional reduction', () => {
    it('should remove redundancies from given route', () => {
        let result = dirReduction.directionalReduction(["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"]);
        expect(result).toEqual(['WEST']);

        result = dirReduction.directionalReduction(["NORTH", "WEST", "SOUTH", "EAST"]);
        expect(result).toEqual(["NORTH", "WEST", "SOUTH", "EAST"]);
    });
});