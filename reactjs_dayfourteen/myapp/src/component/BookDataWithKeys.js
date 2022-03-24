import Book from './Book';

function BookDataWithKeys(){
      //Array of books
      const books =[
            {isbn: 1,bookType:'Science Fiction'}, //0
            {isbn: 2,bookType:'Programming'}, //1
            {isbn: 3,bookType:'Literature'}, // 2
            {isbn: 4,bookType:'Academics'}, // 3
            {isbn: 5,bookType:'Comics'}, //3
            {isbn: 6,bookType: 'Cat'} //4
        ];
        //console.log(books[0]);
     
        return(
            
            <>
                <h1>What all books you have??</h1>
                <ul>
                    {
                        books.map(
                                (book) => <Book key={book.isbn} bookType={book.bookType} />
                            )
                    }
                </ul>
            </>
        );
         
           /**            
        return (
            <>
                <h1>What all books you have??</h1>
                <ul>
                    {
                        books[3].bookType
                    }
                </ul>
            </>    
        );
                    */
}

export default BookDataWithKeys;