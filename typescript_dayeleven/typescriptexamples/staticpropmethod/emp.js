//static :- a static property is shared among all instances of a class.
var EmployeeOne = /** @class */ (function () {
    function EmployeeOne(firstName, lastName, jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        EmployeeOne.headCount++;
    }
    EmployeeOne.getHeadCount = function () {
        return EmployeeOne.headCount;
    };
    EmployeeOne.headCount = 0;
    return EmployeeOne;
}());
var stefan = new EmployeeOne('Stefan', 'Riley', 'Front-end developer');
var shabana = new EmployeeOne('Shabana', 'mehr', 'Back-end developer');
console.log(EmployeeOne.getHeadCount());
