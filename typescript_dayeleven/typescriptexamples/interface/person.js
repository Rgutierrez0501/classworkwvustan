"use strict";
exports.__esModule = true;
var Person = /** @class */ (function () {
    function Person(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Person.prototype.save = function () {
        //throw new Error("Method not implemented.");
        return JSON.stringify(this);
    };
    return Person;
}());
var person = new Person('Prabhat', 'Chandra');
console.log(person.save());
