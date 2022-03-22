import React from 'react';
class Message extends React.Component{

    //If your component has a constructor function ,
    //Always props should be passed to the constructor and also to the React.Component via super()
    constructor(props){
        super(props);
    }

    render(){
        return <h2>{this.props.greetings} !</h2>
    }
}

export default Message;