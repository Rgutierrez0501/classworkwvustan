//props are like function arguments and we send them into the component as attributes
function Flower(props){
    //color and name are the properties(data) of the component Flower
    
    return <h2>I am {props.name} and my colour is {props.color} </h2>
}

export default Flower;