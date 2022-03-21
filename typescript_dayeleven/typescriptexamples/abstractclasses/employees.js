var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
/**
 * An abstract class is typically used to define common behaviors for derived classes to extend.
 * Unlike a regular class, an abstract class cannot be instantiated directly.
 *
 * To declare an abstract class , we use the abstract keyword
 * It contains one or more abstract method
 * An abstract method doesn't conatin implementation.It only defines the signature
 * of the method without including the method body
 */
var Employees = /** @class */ (function () {
    //Declares the firstName and lastName properties
    function Employees(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Employees.prototype.getFullName = function () {
        return "".concat(this.firstName, "  ").concat(this.lastName);
    };
    Employees.prototype.compensationStatement = function () {
        return "".concat(this.getFullName(), "  makes ").concat(this.getSalary(), " a month");
    };
    return Employees;
}());
//Cannot create an instance of an abstract class.ts(2511)
//let emps = new Employees('John','Doe');
var FullTimeEmployee = /** @class */ (function (_super) {
    __extends(FullTimeEmployee, _super);
    function FullTimeEmployee(firstName, lastName, salary) {
        var _this = _super.call(this, firstName, lastName) || this;
        _this.salary = salary;
        return _this;
    }
    FullTimeEmployee.prototype.getSalary = function () {
        //throw new Error("Method not implemented.");
        return this.salary;
    };
    return FullTimeEmployee;
}(Employees));
var Contractor = /** @class */ (function (_super) {
    __extends(Contractor, _super);
    function Contractor(firstName, lastName, rate, hours) {
        var _this = _super.call(this, firstName, lastName) || this;
        _this.rate = rate;
        _this.hours = hours;
        return _this;
    }
    Contractor.prototype.getSalary = function () {
        //throw new Error("Method not implemented.");
        return this.rate * this.hours;
    };
    return Contractor;
}(Employees));
var john = new FullTimeEmployee('John', 'Doe', 1200);
var jane = new Contractor('Jane', 'Doe', 100, 150);
console.log(john.compensationStatement());
console.log(jane.compensationStatement());
