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


 test.each([[1,1,0],[-1,2,-3],[2,2,0]])(
    //%i are format specifiers that expect integers
   '%i  - %i equals %i',(a,b,expected)=>{
       expect(sub(a,b)).toBe(expected);
   } 
);

test.each([[1,1,1],[-1,2,-2],[2,2,4]])(
    //%i are format specifiers that expect integers
   '%i  * %i equals %i',(a,b,expected)=>{
       expect(mul(a,b)).toBe(expected);
   } 
);

test.each([[1,1,1],[-1,2,-0.5],[2,2,1]])(
    //%i are format specifiers that expect integers
   '%i  / %i equals %i',(a,b,expected)=>{
       expect(div(a,b)).toBe(expected);
   } 
);