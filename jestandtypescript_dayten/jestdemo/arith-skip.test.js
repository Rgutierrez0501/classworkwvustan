const {add,mul,sub,div} = require('./arith');

xtest('2+3=5',()=>{
   expect(add(2,3)).toBe(5);
})

test.skip('3-2=1',()=>{
     expect(sub(3,2)).toBe(1);
})

test('3*2=6',()=>{
    expect(mul(3,2)).toBe(6);
})


test('3/2=1.5',()=>{
    expect(div(3,2)).toBe(1.5);
})