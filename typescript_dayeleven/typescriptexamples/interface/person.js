var Person = /** @class */ (function () {
    function Person(firstName, lastName) {
    }
    Person.prototype.toJSON = function () {
        //throw new Error("Method not implemented.");
        return JSON.stringify(this);
    };
    return Person;
}());
var person = new Person('Prabhat', 'Chandra');
console.log(person.toJSON());
