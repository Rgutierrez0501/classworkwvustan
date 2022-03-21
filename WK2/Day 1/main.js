import {Department} from "./department.js"

//<script src="department.js"></script>;

let dept = new Department();
dept.setDeptId(15);
dept.setDeptName("Marketing");

console.log(dept.deptId+"---dept name---"+dept.deptName);
