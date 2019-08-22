package edu.cursor.springsecuritysessions.service;


import edu.cursor.springsecuritysessions.models.Author;

public interface AuthorService {
    void saveAuthor(Author author);

    Author findAuthor(Long authorID);

    void deleteAuthor(Long authorID);

    void updateAuthor(Author oldAuthor, Author newAuthor);
}
