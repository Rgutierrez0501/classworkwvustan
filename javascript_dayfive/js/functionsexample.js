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
//console.log("Printing localMessage ---"+localMessage);
/**
 * Hoisting is a behaviour in JS in which a function or variable can be used before declaration
 *  
 */

//text="Week 1 Friday";
//console.log(text);//undefined -Uncaught ReferenceError: Cannot access 'text' before initialization
//let text;//undefined
let text;//undefined 
text="Week 1 Friday";
console.log(text);
//Function Hoisting - It can be declared befor calling it
displayInfo();
function displayInfo(){
    console.log("I am display info method");
}
/**
 * When a function is used as an expression, an error occurs because only declarations are hoisted.
 */
//dispInfoFuncExpress();
//let dispInfoFuncExpress= ()=>console.log("I am using arrow function");

//Recursive function- a fucntion calling itself
function factorial(number){
        if(number === 0){
            return 1;
        }else{
            return number * factorial(number -1);
        }

}

let num = 4;
if(num>0){
    let result = factorial(num);
    console.log('The factorial of'+ num +" is "+ result);
    console.log(`The factorial of ${num} id ${result}`); 

}

//Closure in JavaScript
function addFunction(){ 
    let i=4; 
    return 4*4;
}
//Closure is a function that preserves the outer scope in its inner scope
function greetEveryone(){//Outer function
    let greeting ="Happy Weekend";
    //Inner function
    function sayBye(){ // sayBye function is a closure
        console.log(greeting);
    }
    //sayBye();
    return sayBye;// it returns sayBye function object
}

let bye =greetEveryone(); //bye is reference of sayBye function
bye();

//Callback is a function passed as an argument to another function
//displayInformation is a callback function
function displayInformation(value){
    console.log("Inside displayInformation --"+value);
}
//displayInformation is passed as an argument
function useCallBackFunction(displayInformation){
    displayInformation("I am using call back function");   
}
//Usage of callback ---Where one function has to wait for another function 
useCallBackFunction(displayInformation);