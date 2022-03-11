let message = "hi";
//Defining the function 
function displayMessage(value){
    //Body of function
    console.log(value);
}
//Calling the function
displayMessage("Hello Everyone Happy to see you all here");

function greetings(){
    return "Good Afternoon All"; //Function greetings is returning the message
}

let greeting = greetings(); // Returned value of function call is assigned to a variable greeting
console.log(greeting);


function addition(x,y){
    console.log("Inside addition function ---"+x+y); //printing 15120
    console.log("Inside addition function ---"+(x+y)); //printing 135
    return x+y;
}

let result =addition(15,120); //calling function
console.log("result--"+result);// printing 135

//Function expressions
let func = function(num){return num*num};
console.log(func(4));
//Using arrow function introduced as part of ES 2015 or ES6
let myfunc = (num)=>num*num;
console.log(myfunc(4)); 

let addTwoNumbers =(a,b)=>a+b;
console.log(addTwoNumbers(2,4));

let greet = ()=>{
    return "Hello All";
}

console.log(greet());

/**
 * Variable scope in JS
 *  1. Global Scope 
 *  2. Local Scope
 */
function greetMessage(){
    //message is a global variable
    console.log(message);
    message="Thank God Its Friday";
    console.log("Inside function ---  "+message);
    //localMessage is a local variable and its accessible within the function greetMessage
    let localMessage = "Over the weekend I am going to learn REST";
    console.log("Printing localMessage ---"+localMessage);
}

greetMessage();

console.log("Outside function ---  "+message);
console.log("Printing localMessage ---"+localMessage);