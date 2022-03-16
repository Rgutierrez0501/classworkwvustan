const sum = require('./sum');

test('adds 1+2 to equal 3',()=>{
    // expect and toBe is used to test that two values were exactly identical.
    expect(sum(1,2)).toBe(3);
})