var message = "Hello World !";
console.log(message);
//Create a new heading 1 element
var heading = document.createElement('h1');
console.log(typeof (heading));
heading.textContent = message;
//add the heading to the document
document.body.appendChild(heading);
