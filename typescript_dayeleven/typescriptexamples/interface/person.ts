import type {Json} from "./json";
class Person implements Json{
  
    constructor(firstName: string,  lastName: string){

    }
    save(): string {
        //throw new Error("Method not implemented.");
        return JSON.stringify(this);
    }
    }

let person = new Person('Prabhat','Chandra');
console.log(person.save());
