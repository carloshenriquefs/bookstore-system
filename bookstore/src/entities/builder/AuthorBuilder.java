package entities.builder;

import entities.Author;

import java.time.LocalDate;

public class AuthorBuilder {

    private Long id;
    private String name;
    private LocalDate dateBirth;

    public AuthorBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public AuthorBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public AuthorBuilder setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
        return this;
    }

    public Author build() {
        return new Author(id, name, dateBirth);
    }
}
