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

//Data types
var num = 25; //number
var firstName = "George"; //String -- sequence of characters
var strObject = {
    lastName: "Gates",firstName:"Bill"
};

document.getElementById('id9').innerHTML="type of variable num --->"+typeof(num);
document.getElementById('id10').innerHTML="type of variable firstName --->"+typeof(firstName);
document.getElementById('id11').innerHTML="type of variable strObject --->"+typeof(strObject);
document.getElementById('id12').innerHTML="value of strObject properties ----"+strObject.lastName +"  --- "+strObject.firstName;
document.getElementById('id13').innerHTML="value of strObject---"+strObject;
//var numberwithchar=25A;

//Declartation of the variable, JavaScript has dynamic types
let y; //Variable without a value is undefined in JS
document.getElementById('id14').innerHTML="value of y ---"+y;
y=16; //initialized our variable y with 16
document.getElementById('id15').innerHTML="value of y after initialization---"+y+" and type of y is "+typeof(y);
y="Vladimir Putin";

document.getElementById('id16').innerHTML="value of y is---"+y+" and type of y is "+typeof(y);

let str1 = "Revature";
let str2 = "Revature is offering very good oppurtunites";
let str3 = "Wish you all happy leraning";

document.getElementById('id17').innerHTML=str1+" ... "+str2+". "+str3+" !";

//JS has only one type of numbers i.e. number
let y1 = 15.50;
let y2 = 15;
document.getElementById('id18').innerHTML="value of variable y1 and y2 is ---"+y1+" "+y2+"---"+typeof(y1)+"---"+typeof(y2);

//Boolean data types which will have two values true or false
let l=15;
let m=15;
let n=16;
document.getElementById('id19').innerHTML="comparison of ---(l==m) --->"+(l==m)+"comparison of ---(l==n)  --->"+(l==n);


//Javascripts Arrays
//Arrays items are separated by commas
//Array indexes are zero based
//             0    ,  1    ,  2    , 3         ,  4
let fruits =["Mango","Apple","Kiwi","Strawberry","Banana"]; //length of an array minus 1 is last index position
let evenNumbers=[2,4,6,8,10,12];
document.getElementById('id20').innerHTML="fruits at index postion ---2  "+fruits[2]+"---"+typeof(fruits);
let mixdataInArray=[2,4,"Apple",5.5,strObject];

document.getElementById('id21').innerHTML=mixdataInArray[4].firstName;
//let varP; //undefined
let fruit='';// its an empty string

//document.getElementById('id22').innerHTML="value of p and fruit---"+p+"---"+fruit;
document.getElementById('id22').innerHTML="value of fruit---"+fruit;
//Using new keyword you can create an array in JS
let decimalNumbers =new Array(15.15,16.50,10.20);
let text='<ul>';
for(let i=0;i<decimalNumbers.length;i++){
    text += '<li>'+decimalNumbers[i]+'</li>';
}

console.log(text);
document.getElementById('id23').innerHTML=text;
//Use of forEach in an Array
let text2 ='<ul>';

fruits.forEach(fruitfunction);
text2+='</ul';

function fruitfunction(value){
    text2 += '<li>'+value+'</li>';
}
document.getElementById('id24').innerHTML=text2;

for(let index=0;index<fruits.length;index++){
    console.log(fruits[index]);
}

/**
 * Array.map()--
 *      1 . It creates a new array by performing a function on each array element.
 *      2 . It does not excute the function for array elements without values.
 *      3 . It does not change the original array
 * Array.filter() --- filter out the elements from arrays based on some condition
 * 
 * Array.reduce() --- it runs a function on each array element to produce (reduce it to) a single value.
 *  it works from left-to-right in the array
 * 
 */

let numbers=[5,2,6,7,8,9,10,11];
let txt ='';
numbers.forEach(myFunction);
function myFunction(value1){
    txt=txt+value1+'<br>';
}

document.getElementById('id25').innerHTML=txt;
console.log("value of txt---"+txt);

//Array.map()
let nums = numbers.map(functionForMap); 

function functionForMap(value){
    return value*2;
}
console.log("map operation ---"+nums);
//Array.filter()
//let numbers=[5,2,6,7,8,9,10,11];
let filteredNumbers = numbers.filter(functionForFilter);
function functionForFilter(value){return value<8;}
console.log("filteredNumbers---"+filteredNumbers);

let sumOfNumbers = numbers.reduce(functionForReduce);
function functionForReduce(total,value){
    return total+value;
}
console.log("reduced value ----"+sumOfNumbers)

let poulationAge=[16,14,25,45,10,50];
let anyEligibleVoters=poulationAge.find(functionToFindVoters);

function functionToFindVoters(value){
    return value>18;
}
console.log("eligible to vote ---"+anyEligibleVoters);
