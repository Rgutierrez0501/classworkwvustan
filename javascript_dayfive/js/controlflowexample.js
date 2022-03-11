/**
 * Comparison operators - 
 * ==
 * !=
 * === -> strict equal to operator
 * !==
 * >
 * >=
 * <
 * <=
 * 
 */
let a=5; b=2; c='hello';
if(a==b){
    console.log("a is equal to b");
}else{
    console.log("a is not equal to b");
}

if(a!=b){
    console.log("Using != operator ---a is not equal to b ");
}else{
    console.log("a equal to b");
}
// checks data type and value
console.log(a===5);// true
console.log(a==='5');
console.log(typeof('5'));

console.log(a!==5);// false
console.log(a!=='5'); //true

/**
 *  logical operators
 * && Logical And
 * || Logical OR
 * !   Logical NOT
 */
const t= true, f=false;
const n=4;
//logical AND
console.log("logical AND");
console.log(t && t);//true
console.log(t && f);//false
console.log((n>2) && (n<2)); // false


//logical OR
console.log("logical OR");
console.log(t || t);//true
console.log(t || f);//true
console.log((n>2) || (n<2)); //true

//logical NOT
console.log("logical NO");
console.log(!t);//false
console.log(!f);//true

const number =prompt("Enter a number: ");
if(number > 0){
    console.log("Number is positive");
}else if (number ==0){
    console.log("The number entered is 0");
}else{
    console.log("The number is negative");
}

/**
 * for loop, while and do while 
 * 
 */

let languages = ['English','French','German','Russian','Spanish'];
/**
 * Infinie loop
for(;;){
    console.log("hii");
} */
/**
for(;10;){
    console.log("hii");
} */

for(let i=0;i<languages.length;i++){
    console.log(languages[i]);
}

let counter =0;
while(counter<10){
    console.log("hi--"+counter);
    counter++;
}
let d=0;
const m =5;
do{
    console.log(d);
    d++;
}while(d<=m);

//break

for(let i=1;i<=5;i++){
    if(i==3){
        break;
    }
    console.log("value of i--"+i);
}
console.log("outside for loop")

for(let i=1;i<=5;i++){
    if(i==3){
        continue;
    }
    console.log("value of i--"+i);
}
console.log("after continue---outside for loop")

let grade=prompt("Enter your grade---");

switch(grade){
    case "A" :
            console.log("Super");
            break;

            case "B" :
                console.log("Very Good");
                break;

            default:
                 console.log("Good");
                 break;
}

/**
 * 2022-03-11
 * 11-03-2022
 */
