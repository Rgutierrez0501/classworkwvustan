/**
 * Inheritance :
 *  A class can reuse the properties and methods of another class. This is called inheritance in TS
 * The class which inherits properties and methods is called the child class.
 * and class whose properties and methods are inherited is known as parent class
 * 
 * Inheritance allows you to resue the functionality of an existing class without rewriting it.
 * TS supports inheritance like ES6
 */
//Book is a parent class or super class
class Book{
    bookId:string;
    bookName:string;

    constructor(bookId:string,bookName:string){
        this.bookId=bookId;
        this.bookName=bookName;
    }

    display():string{
        return `This book is ${this.bookId}   ${this.bookName}`;
    }
}

//ComiceBook is a child class or subclass
class ComicBook extends Book{
    bookType:string;
    constructor(bookId :string , bookName: string ,bookType:string){
        //call the constructor of the Book class
        super(bookId,bookName);
        this.bookType=bookType;
    }
    //Method overriding
    display():string{
        return super.display() + `  Type of book is :-- ${this.bookType}`;
    }
}

class SuperHeroBook extends ComicBook{
    price : number;
    constructor(bookId :string , bookName: string ,bookType:string,price:number){
        super(bookId,bookName,bookType);
        this.price = price;
    }
    //Method overriding
    display():string{
        return super.display() + ` Price of book is :-- ${this.price}`;
    }
}


let comicBook = new ComicBook('ISBN-1232142-DEF','Let Us C','Comic');
console.log(comicBook.bookId);
console.log(comicBook.bookName);
console.log(comicBook.bookType);
console.log(comicBook.display());

let superHeroBook = new SuperHeroBook('ISBN-1232145-HERO','Batman','Comic',25.50);
console.log(superHeroBook.bookId);
console.log(superHeroBook.bookName);
console.log(superHeroBook.bookType);
console.log(superHeroBook.price);
console.log(superHeroBook.display());

