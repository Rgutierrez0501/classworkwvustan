const {add,sub,multi,div}= require ('./arith');
//First paramet '2+3=5' is the name of the test
//Second parameter is the function to be run.
test('2+3=5',()=>{
    //We are testing that the add function returns correct answer for sample data 
    expect(add(2,3)).toBe(5);
})
test('3-2=1',()=>{
    
    expect(sub(3,2)).toBe(1);
})

test('3*2=6',()=>{
    
    expect(sub(3,2)).toBe(6);
})
test('3/2=6',()=>{

    expect(div(3,2)).toBe(1.5);
})
