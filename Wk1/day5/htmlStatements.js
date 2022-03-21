/**
 * Always declare JavaScript variables with var, let or const 
 */
var a=15;
let b=20;
const c=35;

document.getElementById("id1").innerHTML="a--"+a+"b--"+b+"c--"+c

a=55;
b=65;

document.getElementById('id2').innerHTML="a--"+a+"b--"+b+"c--"+c

//Arithmetic Operators
let num1=15;
let num2=25;
let result=0;

result=num1+num2;// result variable on right hand side assignment operstor(=), two operands on left hand side
//Add + is automatic arithmetic operator
document.getElementById('id3').innerHTML="add two numbers="+num1+num2;

//- Arithmetic Operator
result=num1-num2;//result variable on right, assignment on the left of = operand;
document.getElementById('id4').innerHTML="subtract two numbers"+num1+" and "+num2"="+result;

//* Arithmetic Operator
result=num1*num2;//result variable on right, assignment on the left of = operand;
document.getElementById('id5').innerHTML="multiply two numbers"+num1+" and "+num2"="+result;

num1=2;
num2=4;
//** exponent Arithmetic Operator
result=num1**num2;//result variable on right, assignment on the left of = operand;
document.getElementById('id6').innerHTML="the exponent of two numbers"+num1+" and "+num2" = "+result;

// division / Arithmetic Operator
num2=5;
result=num1/num2;//result variable on right, assignment on the left of = operand;
document.getElementById('id7').innerHTML="subtract two numbers"+num1+" and "+num2"="+result;

//% Moduls Arithmetic Operator
result=num1%num2;//result variable on right, assignment on the left of = operand;
document.getElementById('id8').innerHTML="subtract two numbers"+num1+" and "+num2"="+result;

//increment---> ++num1
result = ++ num1;
document.getElementById('id9').innerHTML="increment numers "+num1+" = "+result;