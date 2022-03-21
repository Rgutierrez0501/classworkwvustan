console.log("OOPS");
class Employee{
    
    //Initailizing an object
    coonstructor(empId,empName){
        this.empId=empId;
        this.empName=empName;
    }

    employeeDetail(){
        console.log("Employee detail --"+this.empId+"---"+this.empName);
    }
}

//Creating an object using keyword and calling constructor
let employeeOne= new Employee(101,"Borris");
let employeeTwo= new Employee(102, "Shabana");

//Callback function
employeeOne.employeeDetail();
employeeTwo.employeeDetail();


//Another way to create class

let emp = class {
    constructor(eId,eName){
        this.eId=eId;
        this.eName=eName;
    }

    employeeDetail(){
        this.console.log("Emp detail ---"+this.eId+"---"+this.eName);
    }

}
let e1= new emp(111, "Joshua");
let e2= new emp(112, "Megan");

e1.employeeDetail();
e2.employeeDetail();