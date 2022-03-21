//ES 6 way of creating a class
var Employee = /** @class */ (function () {
    function Employee(ssn, firstName, lastName) {
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Employee.prototype.getFullName = function () {
        return "".concat(this.firstName, " ").concat(this.lastName);
    };
    return Employee;
}());
//We can use the Person "class " by creating a new object
var emp = new Employee('171-28-0926', 'George', 'Fernandes');
console.log(emp.getFullName());
console.log(emp.ssn);
console.log(emp.firstName);
