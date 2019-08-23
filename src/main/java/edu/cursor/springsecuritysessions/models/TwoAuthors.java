package edu.cursor.springsecuritysessions.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TwoAuthors {
    private Author oldAuthor;
    private Author newAuthor;
}
