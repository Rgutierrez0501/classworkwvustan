/**
 * JS doesn't have a concept class like other programming language such as java and c#
 * In ES 5 , we can use a constructor function and prototype inheritance to create a class
 */

// Create a Person class that has three properties ssn,firstName,lastName , We use following constructor function
function Person(ssn,firstName,lastName){
    this.ssn = ssn;
    this.firstName = firstName;
    this.lastName = lastName;
}

//Next we can define a prototype method to get the full name of the person by concatenating first name and last name
Person.prototype.getFullName = function(){
    return `${this.firstName} ${this.lastName}`;
}

//We can use the Person "class " by creating a new object
let person = new Person('171-28-0926','George','Fernandes');
console.log(person.getFullName());