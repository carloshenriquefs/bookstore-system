package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Library {

    private List<Book> books = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> listBooks() {
        List<Book> bookAvailable = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                bookAvailable.add(book);
            }
        }
        return bookAvailable;
    }

    public Book searchBookById(Long id) {
        for (Book book : books) {
            if (Objects.equals(book.getId(), id)) {
                return book;
            }
        }
        return null;
    }

    public void updateBook(Long id, String title) {
        for (Book book : books) {
            if (Objects.equals(book.getId(), id)) {
                book.setTitle(title);
                break;
            }
        }
    }

    public void deleteBookById(Long id) {
        books.removeIf(book -> Objects.equals(book.getId(), id));
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public List<Author> listAuthor() {
        return authors;
    }

    public void updateAuthor(Long id, String name) {
        for (Author author : authors) {
            if (Objects.equals(author.getId(), id)) {
                author.setName(name);
                break;
            }
        }
    }

    public void removeAuthor(Long id) {
        authors.removeIf(author -> Objects.equals(author.getId(), id));
    }

    public void borrowBook(Book book, String name) {
        if (book.isAvailable()) {
            Loan loan = new Loan(book, name);
            loans.add(loan);
            book.setAvailable(false);
        } else {
            System.out.println("Empréstismo não autorizado");
        }
    }

    public void returnBook(Long id) {
        for (Loan loan : loans) {
            if (loan.getId() == id && loan.isActive()) {
                loan.returnBook();
                break;
            }
        }
    }

    public List<Loan> listLoans() {
        return loans;
    }
}
