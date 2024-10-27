package entities.factory;

import entities.Author;
import entities.builder.AuthorBuilder;

import java.time.LocalDate;

public class AuthorFactory {

    public static Author createOneAuthor() {
        return new AuthorBuilder()
                .setId(1L)
                .setName("Carmine")
                .setDateBirth(LocalDate.of(1990, 5, 25))
                .build();
    }

    public static Author createSecondAuthor() {
        return new AuthorBuilder()
                .setId(2L)
                .setName("Robert Kiosaki")
                .setDateBirth(LocalDate.of(1969, 7, 15))
                .build();
    }

    public static Author createThirdAuthor() {
        return new AuthorBuilder()
                .setId(3L)
                .setName("Marty Cagan")
                .setDateBirth(LocalDate.of(1999, 8, 20))
                .build();
    }
}
