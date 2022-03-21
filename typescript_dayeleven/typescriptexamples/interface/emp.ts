/**
 * Typescript interfaces define the contracts within your code. They also provide explicit names for type checking
 */
function getFullName(person:{
    firstName:string;
    lastName:string;
}){
    return `${person.firstName} ${person.lastName}`;
}

let person ={
    firstName : 'Hunter',
    lastName: 'Risse'
};

console.log(getFullName(person));