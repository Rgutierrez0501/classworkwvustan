/**
 * Always declare JavaScript variables with var,let or const
 */
var a= 15; //older method to declare variable
let b=20; // added to JS in 2015
const c=35;// added to JS in 2015
//You cannot re-assign the value to a constant variable
//c=45;

document.getElementById('id1').innerHTML="a--"+a+"b--"+b+"c--"+c

a=55;
b=65;

document.getElementById('id2').innerHTML="a--"+a+"b--"+b+"c--"+c

//Arithmetic Operators
let num1 = 15;
let num2 = 25;
let result = 0;
//+ Arithmetic Operator
result=num1+num2; // result variable on right hand side, assingnment operstor(=), two operands on left hand side 
document.getElementById('id3').innerHTML="add two numbers "+num1 +" and " +num2 +" = "+result;

//- Arithmetic Operator
result=num1-num2; // result variable on right hand side, assingnment operstor(=), two operands on left hand side 
document.getElementById('id4').innerHTML="subtract two numbers "+num1 +" and " +num2 +" = "+result;


//* Arithmetic Operator
result=num1*num2; // result variable on right hand side, assingnment operstor(=), two operands on left hand side 
document.getElementById('id5').innerHTML="multiply two numbers "+num1 +" and " +num2 +" = "+result;

num1 = 2;
num2 = 4;
result=num1**num2; // result variable on right hand side, assingnment operstor(=), two operands on left hand side 
document.getElementById('id6').innerHTML="exponential of two numbers "+num1 +" and " +num2 +" = "+result;
//division
num2 = 5;
result = num2/num1 // 4/2 = 2 , 5/2=2.5
document.getElementById('id7').innerHTML="division of two numbers "+num1 +" and " +num2 +" = "+result;

//modulus division  - 4%2 = 0
// 5%2 = 1 which is remainder
result=num2%num1; // result variable on right hand side, assingnment operstor(=), two operands on left hand side 
document.getElementById('id8').innerHTML="modulus division of two numbers "+num1 +" and " +num2 +" = "+result;

//increment --->  ++num1
result = ++ num1; // new value of variable num1 is now 3 
document.getElementById('id9').innerHTML="increment numbers "+num1 +" = "+result;

//decrement --->  --num1 // value of num1 is 3
result = -- num1; // new value of variable num1 is now 2 
document.getElementById('id10').innerHTML="increment numbers "+num1 +" = "+result;

