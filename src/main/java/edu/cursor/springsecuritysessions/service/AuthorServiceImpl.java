package edu.cursor.springsecuritysessions.service;


import edu.cursor.springsecuritysessions.models.Author;
import edu.cursor.springsecuritysessions.repository.AuthorRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepo authorRepo;

    @Override
    public void saveAuthor(Author author) {
        authorRepo.save(author);
    }

    @Override
    public Author findAuthor(Long authorID) {
        return authorRepo.findById(authorID).orElse(new Author());
    }

    @Override
    public void deleteAuthor(Long authorID) {
        authorRepo.deleteById(authorID);
    }

    @Override
    public void updateAuthor(Author oldAuthor, Author newAuthor) {
        if (authorRepo.existsById(oldAuthor.getId())) {
            this.deleteAuthor(oldAuthor.getId());
            this.saveAuthor(newAuthor);
        } else {
            this.saveAuthor(newAuthor);
        }
    }
}
