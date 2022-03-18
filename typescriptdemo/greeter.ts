import type {Person} from "./person";
function greeter(person :Person) {
    return "Hello, " + person;
}

//let users = "My User";
let users = {firstName : "George", lastName:"Melith"};
console.log(users.firstName);
console.log(greeter(users));