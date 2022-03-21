var StudentDemo = /** @class */ (function () {
    function StudentDemo(ssn, firstName, lastName) {
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    StudentDemo.prototype.getFullName = function () {
        return "".concat(this.firstName, " ").concat(this.lastName);
    };
    StudentDemo.prototype.getSSN = function () {
        return "".concat(this.ssn);
    };
    return StudentDemo;
}());
var studentDemo = new StudentDemo('153-07-3130', 'John', 'Doe');
console.log(studentDemo.ssn);
