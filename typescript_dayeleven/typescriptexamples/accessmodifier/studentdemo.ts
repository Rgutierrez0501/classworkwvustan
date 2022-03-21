//Use of public access modifiers - its default access modifier
class StudentDemo{
    protected ssn:string;
    public firstName: string;
    public lastName: string;
    constructor(ssn :string,firstName:string,lastName:string){
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    getFullName() : string{
        return `${this.firstName} ${this.lastName}`;
    }

    getSSN():string{
        return `${this.ssn}`;
    }
}

let studentDemo = new StudentDemo('153-07-3130','John','Doe');
console.log(studentDemo.firstName);
//Compile time error
//protected :- allows properties and methods of a class to be accessible within same class and within subclass
//console.log(studentDemo.ssn);
console.log(studentDemo.getSSN());
