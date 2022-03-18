const {sum,positive,negative}= require('./math-utils');
/**
 * beforeAll function is part of a test setup.
 * It runs a function before any of the tests in this file run.
 * If the function returns a promise or is a generator, Jest waits for 
 * that promise to resolve befor running tests.
 */

let vals;
let sum_of_vals;
let pos_vals;
let neg_vals;
//Using beforAll function of jest we are intializing the test data before 
//the tests are executed
beforeAll(()=>{
    pos_vals=[2,1,3];
    neg_vals=[-2,-1,-1];
    vals=pos_vals.concat(neg_vals);//[2,1,3,-2,-1,-1]
    console.log('Value of vals -----',vals);
    sum_of_vals=vals.reduce((x,y)=>x+y,0);//2
})

//test function
test('The sum of vals should be 2',()=>{
    expect(sum(vals)).toBe(sum_of_vals);
})
/**  To test the positive function, we use the toEqual matcher. 
 * We test that the function returns an array of positive values 
 * equal to the predefiend test array of values
*/
test('Should get positive values',()=>{
    expect(positive(vals)).toEqual(pos_vals);
})

test('Should get negative values',()=>{
    expect(negative(vals)).toEqual(neg_vals);
})
