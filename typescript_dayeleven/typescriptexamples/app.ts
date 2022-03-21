let message:string ="Hello World !";
console.log(message);
//Create a new heading 1 element
let heading = document.createElement('h1');
console.log(typeof(heading));
heading.textContent = message;

//add the heading to the document
document.body.appendChild(heading);