let emp= class Employee {
    constructor(eId,eName){
        this.eId=eId;
        this.eName=eName;
    }

    empDetail(){
        console.log("Emp detail ---"+this.eId+"---"+this.eName);
        console.log("Inside empDetails----"+Employee.eId);
    }
}

console.log(Employee.eId);
console.log(Employee.eName); //ex of undefined push back

let emp1= new employeeOne(1,"Fatima");
emp1.empDetail();
console.log("------"+emp1.eId+"--"+emp1.eName)