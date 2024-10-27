package entities.builder;

import entities.Book;

import java.time.LocalDate;

public class BookBuilder {

    private Long id;
    private String title;
    private String author;
    private boolean available;
    private LocalDate dateRegistration;
    private LocalDate dateUpdate;

    public BookBuilder setId(Long id) {
        this.id = id;
        return this;
    }

    public BookBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder setAvailable(boolean available) {
        this.available = available;
        return this;
    }

    public BookBuilder setDateRegistration(LocalDate dateRegistration) {
        this.dateRegistration = dateRegistration;
        return this;
    }

    public BookBuilder setDateUpdate(LocalDate dateUpdate) {
        this.dateUpdate = dateUpdate;
        return this;
    }

    public Book build() {
        return new Book(id, title, author, available, dateRegistration, dateUpdate);
    }
}
