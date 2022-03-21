interface Person{
    firstName :string;
    lastName :string;
}

function getFullName(person:Person){
    return `${person.firstName} ${person.lastName}`;
}

let rosa = {
    firstName:'Rosa',
    lastName:'Gutierrez'
};

console.log(getFullName(rosa));
