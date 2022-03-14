//import {Department} from "./department.js";
let depart = require("./department.js");// We are getting module
let dept = depart.Department; // We are getting class
let d = new dept(); // Creating an object
d.setDeptId(11);
d.setDeptName("Marketing");

console.log(d.deptId+"---dept name---"+d.deptName);