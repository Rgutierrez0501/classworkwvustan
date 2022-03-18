const {add,mul,sub,div} = require('./arith');

test('2+3=5',()=>{
    expect(add(2,3)).toBe(5);
})