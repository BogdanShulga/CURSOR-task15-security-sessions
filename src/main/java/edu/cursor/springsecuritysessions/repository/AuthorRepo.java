package edu.cursor.springsecuritysessions.repository;

import edu.cursor.springsecuritysessions.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Long> {
}
