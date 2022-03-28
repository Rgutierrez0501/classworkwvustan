import React from "react";
import Employee from "./Emp";
function Employees(props: Employee){

    //Write a function to retriev data from DB(i.e postgresql) via express js
return (
    <>
        <ul>
            <li>{props.empId}</li>  <li>{props.empName}</li>
        </ul>
    </>
);
    
}

export default Employees;