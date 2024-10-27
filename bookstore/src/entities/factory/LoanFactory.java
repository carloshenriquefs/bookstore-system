package entities.factory;

import entities.Loan;
import entities.builder.LoanBuilder;

import java.sql.Date;

import static entities.factory.BookFactory.createOneBook;

public class LoanFactory {

    public static Loan createLoans() {
        return new LoanBuilder()
                .setId(1)
                .setBook(createOneBook())
                .setNameUser("Contar Histórias")
                .setLoanDate(Date.valueOf("2022-02-02"))
                .setReturnDate(Date.valueOf("2015-06-10"))
                .setActive(true)
                .build();
    }
}
