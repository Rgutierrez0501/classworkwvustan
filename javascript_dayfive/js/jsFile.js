/**
 * Assignment Operator in JS
 */

let d = 15;
let e = 5;
let result=0;

result = d+e;
document.getElementById('id1').innerHTML="add ---"+result;

//+=
result += d; // equivalent result = result+d; result = 20+15 = 35
document.getElementById('id2').innerHTML="add ---"+result;

//-=
result -= d; // equivalent result = result - d; result = 35-15 =20
document.getElementById('id3').innerHTML="subtract ---"+result;

//*=
result *= d; // equivalent result = result * d; result = 20 * 15 =300
document.getElementById('id4').innerHTML="multiply ---"+result;


// /=
result /= d; // equivalent result = result / d; result = 300 / 15 =20
document.getElementById('id5').innerHTML="division assignment operator ---"+result;

// %=
result %= d; // equivalent result = result % d; result = 20 % 15 =5
document.getElementById('id6').innerHTML="modulus division assignment operator ---"+result;

// <<=
result =4;
d= 2;
result <<= d; // equivalent result = result << d; result = 4 << 2=
document.getElementById('id7').innerHTML="left shift   assignment operator ---"+result;

// >>=
result =4;
d= 2;
result >>= d; // equivalent result = result >> d; result =  >> 15=
document.getElementById('id8').innerHTML="right shift to  assignment operator ---"+result;