import React, { useState } from 'react';

function Student(){

    const [student,setStudent] = useState(
        {
            studentId:1 ,studentName:'Billy',
            studentCity:'New York'
        }
    );

    const updateCity =()=>{
        setStudent(prevState => {
                return {...prevState,studentCity:"Washington",studentName:"Mathew"}
        });
    }

    return (
        <>
            <h1>Student details are :</h1>
            <p>
                Student with id {student.studentId} belongs to {student.studentCity} city and his name is {student.studentName}
            </p>
            <button type ="button" onClick={updateCity}>
                Click To get Student Info
            </button>
        </>
    );
}

export default Student;