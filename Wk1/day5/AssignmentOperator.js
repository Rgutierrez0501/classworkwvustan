/**
 * Assignment Operator in JS
 */
let d= 15;
let e=5;
let result=0;

result = d+e;
document.getElementById('id1').innerHTML="add ---"+result;

//+=
result+=d; // equivalent result = result + d; result = 20 + 15 = 35
document.getElementById('id2').innerHTML="add ---"+result;

//-=
result -=d;// equivalent result = result - d; result = 20 - 15 = 5
document.getElementById('id3').innerHTML="add ---"+result;

//*=
result *=d; // equivalent result = result * d; result = 20 * 15 = 300
document.getElementById('id4').innerHTML="add ---"+result;

// /=
result /=d; // equivalent result = result / d; result = 300/ 15 = 20
document.getElementById('id5').innerHTML="left shift assignment operator ---"+result;

//%=
result %=d; // equivalent result = result % d; result = 20 % 15 = 5
document.getElementById('id6').innerHTML="left shift assignment operator ---"+result;

// <<=
result <<=d; // equivalent result = result << d; result = 5 << 15= 
document.getElementById('id7').innerHTML="left shift assignment operator ---"+result;

//>>=
result >>=d; // equivalent result = result >> d; result = >> 15 =
document.getElementById('id8').innerHTML="right shift to assignment operator ---"+result;

//Data types
var num=15; //number
var firstName="George";//String-- sequence of characters
var strObject = {
    lastName: "Gates", firstName: "Bill"
}; 

document.getElementById('id9').innerHTML="type of variable num -->"+typeof(num);//typeof of function will tell me type of variable.
document.getElementById('id10').innerHTML="type of variable num -->"+typeof(firstName);
document.getElementById('id11').innerHTML="type of variable num -->"+typeof(strObject);
document.getElementById('id12').innerHTML="value of strObject properties -->"+strObject.lastName+"---"+strObject.firstName;
document.getElementById('id13').innerHTML="value of strObject---"+strObject;
//var numberwitchchar=25A;

let y; //variable without a value is undefined in JS because it is not initialized aka declared
document.getElementById('id14').innerHTML="value of y--"+y;
y=16; //initialize variable

document.getElementById('id15').innerHTML="value of y after initialization"+y+" and type"+typeof(y);
y="Vladimir Putin"; //

document.getElementById('id16').innerHTML="value of y is--"+y+" and type of y is "+typeof(y);

let str1="Revature";
let str2="Revature is offering very good oppurtunities";
let str3= "Wish you all happy learning ";

document.getElementById('id17').innerHTML=str1+" ..."+str2+"...."str3+" !"

//JS has only number for number values num is inclusive of integar and float

let y1=15.50;
let y2=15;

document.getElementById('id18').innerHTML="value of variable y1 and y2 is ---"+y1+" "+y2+" ---";

//Boolean data types which will have two values true or false

let l=15;
let m=15;
let n=16;
document.getElementById('id19').innerHTML="comparison of ---(1==m)-->"+(1==m)+"Comparison";


//Javascript Arrays
//Arrays items are separated by comas
//Arrays indexes are zero based 
//

let fruits=["manago","apple","kiwi","Strawberry","banana";//length of a array minus 1]
let  eventNmbers=[2,4,6,8,10,12];
document.getElementById('id20').innerHTML="fruits at index position ---2 "+fruits[2]+"---"+fruits[1];
let mixdataInArray=[2,4,"apple",5.5,strObject];

document.getElementById('id21').innerHTML=mixdataInArray[4].firstName;
//let varP;//undefined
let fruit=' ';//its an empty string

//document.getElementById('id22').innerHTML="value of p and fruit ---"+p+"---"+fruit;
document.getElementById('id22').innerHTML="value of fruit---"+fruit;
//Using new keyword you can create an array in JS

let decimalNumbers=new Array(15, 15, 16.50, 10.20);
let text = '<ul>';
for(let i=0;i<decimalNumbers.length;i++){
    text+='<li>'+decimalNumbers[i]+'</li>';
}

console.log(text);
document.getElementById('id23').innerHTML=text;

let text2 = '<ul>';
fruits.forEach(fruitfunction);
text2+='</ul>'
