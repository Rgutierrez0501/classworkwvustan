import React from 'react';

class FootBall extends React.Component{
    constructor(props) {
        super(props);
        // This binding is necessary to make `this` work in the callback
        this.shoot = this.shoot.bind(this);
      }
    
    shoot(){
            alert("Great shot !");
    }

    render(){
        return (<button onClick={this.shoot}> Take the shot ! </button>);
    }   
}

export default FootBall;