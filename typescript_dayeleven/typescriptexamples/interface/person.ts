class Person implements JSON{
  
    constructor(firstName: string,  lastName: string){

    }
    toJSON(): string {
        //throw new Error("Method not implemented.");
        return JSON.stringify(this);
    }
}

let person = new Person('Prabhat','Chandra');
console.log(person.toJSON());
