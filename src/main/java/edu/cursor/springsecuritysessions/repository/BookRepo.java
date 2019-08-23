package edu.cursor.springsecuritysessions.repository;

import edu.cursor.springsecuritysessions.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}
