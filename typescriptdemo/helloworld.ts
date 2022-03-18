let message ='Hello, Typescript!';

//console.log(message);
//creating a new heading 1 element 
let heading = document.createElement('h1');
heading.textContent = message;

//add the heading to the document
document.body.appendChild(heading);

//To create an object with an inferred type which includes name:string and id: number , you can write as below
const user ={
    name:'George',
    id:1
};