const {add,mul,sub,div} = require('./arith');

test ('2+3=5',()=>{
    expect(add(2,3)).toBe(5);

})

test ('2*3=5',()=>{
    expect(mul(2,3)).toBe(6);

})

test ('2-3=-1',()=>{
    expect(sub(2,3)).toBe(-1);

})

test ('2/3=0.6666666666666666',()=>{
    expect(div(2,3)).toBeCloseTo(0.666);

})