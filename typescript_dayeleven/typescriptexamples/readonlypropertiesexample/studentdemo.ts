
class StudentD{
    private ssn:string;
    private firstName: string;
    private lastName: string;
    //Read only properties 
    readonly birthDate:Date;
    constructor(ssn :string,firstName:string,lastName:string,birthDate:Date){
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate
    }

    getFullName() : string{
        return `${this.firstName} ${this.lastName}`;
    }

    getSSN():string{
        return `${this.ssn}`;
    }
}


let studentD = new StudentD('153-07-3130','John','Doe',new Date(1990,12,25));
//Compile error as we are trying to reassign  the birthDate property that results in error 
//studentD.birthDate = new Date(1991,12,25);
console.log(studentD.getSSN());

/**
 * Readonly    Vs Const
 * Readonly :- Used for class properties
 *              Initialized in the declaration or in the constructor of the same class
 * 
 * const :- used for variables
 *          Initialzed in the declaration
 *  const x = 10;
 */
 const x = 10;