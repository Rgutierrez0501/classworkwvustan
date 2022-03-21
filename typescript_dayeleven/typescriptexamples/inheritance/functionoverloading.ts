/**
 * Method Overloading - if we will add functions with the same name and different arguments
 * JS doesn't support function overloading natively.
 */
//Calculating multiplication of two numbers
//In TS function overlaoding can be achieved in below ways
function add(x:number,y:number) :number;
function add(x:string,y:string) :string;
function add(x:any,y:any) :any{
    //return x*y;
    return x+y;
}
//Function overloading with different number of parameters and types with same name is not supported
//function add(x:number)
//Last function must have implementation
/** 
function add(x:any,y:any) :any{
    //return x*y;
    return x+y;
}**/

console.log(add(5,6));
console.log(add(2.5,2.0));
console.log(add("Shabana","Mehr"));