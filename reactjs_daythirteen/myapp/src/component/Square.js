import React from 'react';
/**
 * React component can have state by setting this.state in their constructors, this.state should be considered as 
 * private to a React component that it's defined in.
 */
class Square extends React.Component {

    constructor(props){
        super(props);
        this.state = {
            value:null,
        }
    }
    render() {
      return (
        //<button className="square" onClick={function() {console.log('click');}}>
        //<button className="square" onClick={() => {console.log('click');}}>  
        //{this.props.value}
        //</button>
        /**
         * By calling this.setState from onClick handler in the Square's render method, we tell React to re-render that 
         * Square whenever its <button> is clicked. 
         */
        /**
        <button className="square" 
            onClick={() => {this.setState({value:'X'})}}>  
            {this.state.value}
        </button>
         */
        <button className='square'
        onClick={()=>this.props.onClick()}>
            {this.props.value}
        </button>
      );
    }
  }

  export default Square;