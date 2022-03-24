import Book from './Book';
function BookData(){
    //Array of books
    const books =['Science Fiction','Programming','Literature','Academics','Comics','Cat'];
    // Here we map() method to render list of items.
    // .map() method allows you to run a function on each item in the array books,returning a new array as the result.
    return(
        <>
            <h1>What all books you have??</h1>
            <ul>
                {
                    books.map(
                            (book) => <Book bookType={book} />
                        )
                }
            </ul>
        </>
    );
}

export default BookData;