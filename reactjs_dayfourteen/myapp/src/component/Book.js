/**
 * In react we will render lists with some type of loop
 * Javascript map() array method is preferred method to render lists
 * 
 */

function Book(props){
    return <li> I am a {props.bookType} books</li>;
}

export default Book;