package edu.cursor.springsecuritysessions.controller;

import edu.cursor.springsecuritysessions.models.Author;
import edu.cursor.springsecuritysessions.models.TwoAuthors;
import edu.cursor.springsecuritysessions.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class AuthorController {

    private AuthorService authorService;

    @PostMapping("/admin/saveAuthor")
    public void saveAuthor(@RequestBody Author author) {
        authorService.saveAuthor(author);
    }

    @GetMapping("/user/find_author/{authorID}")
    public Author findAuthor(@PathVariable("authorID") Long authorID) {
        return authorService.findAuthor(authorID);
    }

    @DeleteMapping("/admin/delete_author/{authorID}")
    public void deleteAuthor(@PathVariable("authorID") Long authorID) {
        authorService.deleteAuthor(authorID);
    }

    @PutMapping("/admin/update_author")
    public void updateAuthor(@RequestBody TwoAuthors twoAuthors) {
        authorService.updateAuthor(twoAuthors.getOldAuthor(), twoAuthors.getNewAuthor());
    }
}
