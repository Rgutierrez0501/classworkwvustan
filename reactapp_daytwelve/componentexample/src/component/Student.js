import React from 'react';
function Student(){
    //Student component is referring to another component Course
    //<> </> Short notation for React.Fragment --> Fragment let you group a list of children without adding
    //extra nodes to the DOM (..it is used to return multiple elements)
    /**
    return(
        <>
        <h2>I am a student </h2>
        <Course /> 
        </>
        ) ;
         */
        //Logic to call an api 
        //It will return data and this data will be passed to the components for rendering
        return(
            <React.Fragment>
            <h2>I am a student </h2>
            <Course /> 
            </React.Fragment>
            ) ;
}

function Course(){
    return <h3>Enroll for Computer Science course</h3>;
}

export default Student;