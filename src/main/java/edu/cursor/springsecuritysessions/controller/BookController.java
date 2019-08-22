package edu.cursor.springsecuritysessions.controller;

import edu.cursor.springsecuritysessions.models.Book;
import edu.cursor.springsecuritysessions.models.TwoBooks;
import edu.cursor.springsecuritysessions.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class BookController {

    private BookService bookService;

    @PostMapping("/admin/save_book")
    public void saveAuthor(@RequestBody Book book) {
        bookService.saveBook(book);
    }

    @GetMapping("/user/find_book/{bookID}")
    public Book findAuthor(@PathVariable("bookID") Long authorID) {
        return bookService.findBook(authorID);
    }

    @DeleteMapping("/admin/delete_book/{bookID}")
    public void deleteAuthor(@PathVariable("bookID") Long authorID) {
        bookService.deleteBook(authorID);
    }

    @PutMapping("/admin/update_book")
    public void updateAuthor(@RequestBody TwoBooks twoBooks) {
        bookService.updateBook(twoBooks.getOldBook(), twoBooks.getNewBook());
    }
}
