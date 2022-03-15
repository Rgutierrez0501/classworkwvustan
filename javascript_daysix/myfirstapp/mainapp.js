//import {Department} from "./department.js";
let depart = require("./department.js");// We are getting module
let dept = depart.Department; // We are getting class
let d = new dept(); // Creating an object
d.setDeptId(11);
d.setDeptName("Marketing");

console.log(d.deptId+"---dept name---"+d.deptName);

// array
const students = ['John', 'Sara', 'Jack'];
for (let student of students){
    console.log(student);
}

const strVar = "code";
for(let element of strVar){
    console.log(element);
}

const student = {
    name: 'Monica',
    class: 7,
    age: 12
}

for(key in student){
    console.log(`${key} => ${student[key]}`);
}
console.log(student.name);