import type {Json} from "./json";
class Person implements Json{
  firstName :string;
  lastName :string;
    constructor(firstName: string,  lastName: string){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    save(): string {
        //throw new Error("Method not implemented.");
        return JSON.stringify(this);
    }
    }

let person = new Person('Prabhat','Chandra');
console.log(person.save());
