package entities.factory;

import entities.Book;
import entities.builder.BookBuilder;

import java.time.LocalDate;

public class BookFactory {

    public static Book createOneBook() {
        return new BookBuilder()
                .setId(1L)
                .setTitle("Storytelling")
                .setAuthor("Carmine Gallo")
                .setAvailable(true)
                .setDateRegistration(LocalDate.of(2020, 6, 3))
                .setDateUpdate(LocalDate.of(2024, 8, 14))
                .build();
    }

    public static Book createSecondBook() {
        return new BookBuilder()
                .setId(2L)
                .setTitle("Pai Pobre Pai Rico")
                .setAuthor("Robert")
                .setAvailable(true)
                .setDateRegistration(LocalDate.of(2023, 4, 13))
                .setDateUpdate(LocalDate.of(2022, 2, 4))
                .build();
    }

    public static Book createThirdBook() {
        return new BookBuilder()
                .setId(3L)
                .setTitle("Inspirado")
                .setAuthor("Marty Cagan")
                .setAvailable(true)
                .setDateRegistration(LocalDate.of(2024, 7, 20))
                .setDateUpdate(LocalDate.of(2024, 7, 19))
                .build();
    }
}
