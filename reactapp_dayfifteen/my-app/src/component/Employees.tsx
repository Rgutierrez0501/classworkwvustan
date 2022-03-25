import React from "react";
import Employee from "./Emp";
function Employees(props: Employee){
return (
    <>
        <ul>
            <li>{props.empId}</li>  <li>{props.empName}</li>
        </ul>
    </>
);
    
}

export default Employees;