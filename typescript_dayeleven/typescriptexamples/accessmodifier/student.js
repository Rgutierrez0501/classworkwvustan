/**
 * Access modifiers :- it can change the visibility of the properties and methods of a class.
 * Typescript provides three access modifiers:
 *  private
 *  protected - default
 *  public
 *
 * Note : TS controls the access logically during compilation time, not at runtime
 */
//private : limits the visibility to the same-class only. 
//pulbic : allows class properties and methods to be accessible from all locations. Its default access modifier
//protected :allows properties and methods of a class to be accessible within same class and within subclass
var Student = /** @class */ (function () {
    function Student(ssn, firstName, lastName) {
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Student.prototype.getFullName = function () {
        return "".concat(this.firstName, " ").concat(this.lastName);
    };
    Student.prototype.getSSN = function () {
        return "".concat(this.ssn);
    };
    return Student;
}());
var student = new Student('153-07-3130', 'John', 'Doe');
//Compile Error
//console.log(student.ssn);
console.log(student.getSSN());
