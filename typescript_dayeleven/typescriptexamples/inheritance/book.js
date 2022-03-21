var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
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
var Book = /** @class */ (function () {
    function Book(bookId, bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }
    Book.prototype.display = function () {
        return "This book is ".concat(this.bookId, "   ").concat(this.bookName);
    };
    return Book;
}());
//ComiceBook is a child class or subclass
var ComicBook = /** @class */ (function (_super) {
    __extends(ComicBook, _super);
    function ComicBook(bookId, bookName, bookType) {
        var _this = 
        //call the constructor of the Book class
        _super.call(this, bookId, bookName) || this;
        _this.bookType = bookType;
        return _this;
    }
    //Method overriding
    ComicBook.prototype.display = function () {
        return _super.prototype.display.call(this) + "Type of book is :-- ".concat(this.bookType);
    };
    return ComicBook;
}(Book));
var SuperHeroBook = /** @class */ (function (_super) {
    __extends(SuperHeroBook, _super);
    function SuperHeroBook(bookId, bookName, bookType, price) {
        var _this = _super.call(this, bookId, bookName, bookType) || this;
        _this.price = price;
        return _this;
    }
    //Method overriding
    SuperHeroBook.prototype.display = function () {
        return _super.prototype.display.call(this) + "Price of book is :-- ".concat(this.price);
    };
    return SuperHeroBook;
}(ComicBook));
var comicBook = new ComicBook('ISBN-1232142-DEF', 'Let Us C', 'Comic');
console.log(comicBook.bookId);
console.log(comicBook.bookName);
console.log(comicBook.bookType);
console.log(comicBook.display());
var superHeroBook = new SuperHeroBook('ISBN-1232145-HERO', 'Batman', 'Comic', 25.50);
console.log(superHeroBook.bookId);
console.log(superHeroBook.bookName);
console.log(superHeroBook.bookType);
console.log(superHeroBook.price);
console.log(superHeroBook.display());
