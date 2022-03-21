//ES 6 way of creating a class
//When you annotate types to Properties,constructor and method, TS compiler will carry the corresponding type checks.
class Employee{
    ssn :string; // type annotations
    firstName : string;
    lastName : string;
    constructor(ssn :string,firstName:string,lastName:string){
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    getFullName() : string{
        return `${this.firstName} ${this.lastName}`;
    }
}

//We can use the Person "class " by creating a new object
let emp = new Employee('171-28-0926','George','Fernandes');
console.log(emp.getFullName());
console.log(emp.ssn);
console.log(emp.firstName);