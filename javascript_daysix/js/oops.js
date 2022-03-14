console.log("OOPS");
//Declaring class Employee
class Employee{
     
    //Initializing an object
    constructor(empId,empName){
        this.empId=empId;
        this.empName=empName;
    }

    employeeDetail(){
        console.log("Employee detail ---"+this.empId+"---"+this.empName);
    }

}

//Creating an object using new keyword and calling constructor
let employeeOne = new Employee(101,"Borris");
let employeeTwo = new Employee(102,"Shabana");

//Calling the method
employeeOne.employeeDetail();
employeeTwo.employeeDetail();

//Decalring class as a function  or class expression
let emp = class {
    constructor(eId,eName){
        this.eId=eId;
        this.eName=eName;
    }

    empDetail(){
        console.log("Emp detail ---"+this.eId+"---"+this.eName); 
    }
}
console.log("type of emp ----"+typeof(emp));
console.log("type of employeeOne ----"+typeof(employeeOne));
let e1 = new emp(111,"Joshua");
let e2 = new emp(112,"Megan");
console.log("type of e1 ----"+typeof(e1));
e1.empDetail();
e2.empDetail();
