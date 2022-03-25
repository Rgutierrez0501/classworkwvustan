import React,{useEffect} from "react";


//function Greet({ name }) {
  function Greet(props) {
    //const message = `Hello, ${name}!`; // Calculates output
    const message = `Hello, ${props.name}!`;
    // Bad!
    //document.title = `Greetings to ${name}`; // Side-effect!
    /** 
     * The document title update is the side-effect because it doesn't directly calculate the component output. 
     * That's why document title update is placed in a callback and supplied to useEffect().
     * */
     
    useEffect(() => {
      // Good!
      document.title = `Greetings to ${props.name}`; // Side-effect!
    }, [props.name]);
    return <div>{message}</div>;       // Calculates output
  }


  export default Greet;