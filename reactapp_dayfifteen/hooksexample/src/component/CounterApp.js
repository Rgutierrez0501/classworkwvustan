import React, { useState } from 'react';

function CounterApp(){
    /**
     * React Hooks methods or functions:-
     * useState
     * useEffect
     * useContext
     * useRef
     * useReducer
     * userCallback
     * useMemo
     * custom Hooks
     */
    //Using useState method or function we are trying to access state of a react component
    //useState returns a pair: the current state value and a function that lets you update it.
    //const [count,setCount]=useState(0) ;
    /**
     * We are intializing our state by calling useState in our function component
     * Here in below example:-
     * counter -- is representing the current state
     * setCounter -- A function that updates the state
     * 
     * In class component you can use state object(inside contructor you can initialize this.state)
     * to access state of component
     */
    const [counter,setCounter]=useState(0) ; 

    //Reading the state --- {counter} 
    return (
        <div>
            <p>You clicked {counter} times</p>
            <button onClick={() => setCounter(counter + 1)}>
                Click me
            </button>
        </div>
    );

}

export default CounterApp;