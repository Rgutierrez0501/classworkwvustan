let employee = class Employee{
    constructor(eId,eName){
        this.eId=eId;
        this.eName=eName;
    }

    empDetail(){
        console.log("Emp detail ---"+this.eId+"---"+this.eName); 
        console.log("Inside empDetails-----"+Employee.eId);
    }

}

console.log(employee.eId); //undefined
console.log(Employee.eId);//undefined

//Create an object of employee 
let emp1 = new employee(1,"Fatima");
emp1.empDetail();
console.log("-----------"+emp1.eId+"---"+emp1.eName)

console.log("-----------"+typeof(emp1.eId)+"---"+typeof(emp1.eName)+"---"+typeof(emp1));