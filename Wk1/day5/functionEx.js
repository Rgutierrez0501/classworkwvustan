
function displayMessage(value){
    //body of function
    console.log(value);
}
//calling the function
displayMessage("Hello Everyone, Happy to see you all here");

function greetings(){
    return "Good Afternoon All";//function greetings is returning the message
}

let greeting = greetings(); //returned value of function call is is assigned to a variable greeting.
console.log(greeting);

function addition(x,y){
    console.log("Inside addition function ---"+x+y);
    return x+y;
}

let result = addtion(15,120); //calling function
console.log("result--"+result);//printing 135

//Function expression
let func= function(num)(return num*num);
console.log(func(4)); //this function style/method is replaced by arrow function in js which was introduced 2015

//Using arrow function introduced as part of ES 2015 or ES6
let myfunc = (num)=>num*num;
console.log(myfunc(4));

let addTwoNumbers=(a,b) => a+b;
console.log(addTwoNumbers(2,4));

let great = () => {
    return "Hello All"
}

console.log(great());

/**
 * variable scope in JS
 * 1.GLobbal scope
 * 2. Local Scope
 */

function greatMessage(){
    console.log(greatMessage);
    messagage="Thank God Its Friday";
    console.log("Inside function ---"+messagage);
    //localMessage is a local variable and its accessible within the function greetMessage
    let localMessage = "Over the weekend I am going to learn REST";
    console.log("printing localMessage ---"+localMessage);
}

greatMessage();

console.log("Outside of the function")

/**
 * variable hoisting is a behavior in JS which a function or variable is can be used before declaration.
 * 
