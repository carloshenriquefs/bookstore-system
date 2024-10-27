package entities;

import java.time.LocalDate;

public class Book {

    private Long id;
    private String title;
    private String author;
    private boolean available;
    private LocalDate dateRegistration;
    private LocalDate dateUpdate;

    public Book(Long id, String title, String author, boolean available, LocalDate dateRegistration, LocalDate dateUpdate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = available;
        this.dateRegistration = dateRegistration;
        this.dateUpdate = dateUpdate;
    }

    public Book(String title, String author, boolean available, LocalDate dateRegistration, LocalDate dateUpdate) {
        this.title = title;
        this.author = author;
        this.available = available;
        this.dateRegistration = dateRegistration;
        this.dateUpdate = dateUpdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDate getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(LocalDate dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public LocalDate getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(LocalDate dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", available=" + available +
                ", dateRegistration=" + dateRegistration +
                ", dateUpdate=" + dateUpdate +
                '}';
    }
}
