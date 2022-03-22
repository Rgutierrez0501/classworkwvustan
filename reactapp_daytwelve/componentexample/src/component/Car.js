import React from 'react';
//Car class is inheriting the properties of React.Component
class Car extends React.Component{
    //Component constructor--initiates the component properties and component properties should be kept in an object 
    //called state
    constructor(){
        //using super() statement we are honoring the inheritance of the parent component 
        super();

        //using this.state we are setting the props color and its value
        //this refers current instance of a class
        this.state = {color : "red", name :"Audi"};
    }

    render(){
        return <h2>I am {this.state.color} color {this.state.name} Car !</h2>
    }
}

export default Car;