package bookstore.service;

import bookstore.entity.Book;

public class BookService {

    public Book createBook(String title, int price){
        Book book = new Book();
        book.setPrice(price);
        book.setTitle(title);
        return book;
    }
}
