/**
 * Parameterized tests allows us to run the same test multiple times using different values.
 */

 const {add,mul,sub,div} = require('./arith');

 //each() is global function provided by jest framework
 //[[1,1,2],[-1,2,1],[2,1,3]]   --- an array of arrays
 test.each([[1,1,2],[-1,2,1],[2,1,3]])(
     //%i are format specifiers that expect integers
    '%i +%i equals %i',(a,b,expected)=>{
        expect(add(a,b)).toBe(expected);
    } 
 );