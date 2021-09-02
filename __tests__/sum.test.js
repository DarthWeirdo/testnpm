const sum = require('../src/sum');

test('adds 1 + 2 to equal 3', () => {
    expect(sum(1, 2)).toBe(3);
});

test('adds 5 + 5 to equal 9', () => {
    expect(sum(5, 5)).toBe(9);
});