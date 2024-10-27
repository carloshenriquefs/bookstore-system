package entities.builder;

import entities.Book;
import entities.Loan;

import java.util.Date;

public class LoanBuilder {

    private int id;
    private Book book;
    private String nameUser;
    private Date loanDate;
    private Date returnDate;
    private boolean active;

    public LoanBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public LoanBuilder setBook(Book book) {
        this.book = book;
        return this;
    }

    public LoanBuilder setNameUser(String nameUser) {
        this.nameUser = nameUser;
        return this;
    }

    public LoanBuilder setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
        return this;
    }

    public LoanBuilder setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
        return this;
    }

    public LoanBuilder setActive(boolean active) {
        this.active = active;
        return this;
    }

    public Loan build() {
        return new Loan(book, nameUser);
    }
}
