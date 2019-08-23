package edu.cursor.springsecuritysessions.service;


import edu.cursor.springsecuritysessions.models.Book;

public interface BookService {
    void saveBook(Book book);

    Book findBook(Long bookID);

    void deleteBook(Long bookID);

    void updateBook(Book oldBook, Book newBook);
}
