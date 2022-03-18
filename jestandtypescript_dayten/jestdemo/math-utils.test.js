const {sum,positive,negative}= require('./math-utils');

let vals;
let sum_of_vals;
let pos_vals;
let neg_vals;
//Using beforAll function of jest we are intializing the test data befor the tests are executed
beforeAll(()=>{
    pos_vals=[2,1,3];
    neg_vals=[-2,-1,-1];
    vals=pos_vals.concat(neg_vals);
    sum_of_vals=vals.reduce((x,y)=>x+y,0);
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
