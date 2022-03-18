const {add,mul,sub,div} = require('./arith');
//First parameter '2+3=5' is the name of the test
//Second parameter is the function to be run.
test('2+3=5',()=>{
    //We are testing that the add function returns correct answer for sample data
    expect(add(2,3)).toBe(5);
})