import entities.Book;
import entities.Library;

import java.util.Scanner;
import java.util.List;

import static entities.factory.AuthorFactory.createOneAuthor;
import static entities.factory.AuthorFactory.createSecondAuthor;
import static entities.factory.AuthorFactory.createThirdAuthor;
import static entities.factory.BookFactory.createOneBook;
import static entities.factory.BookFactory.createSecondBook;
import static entities.factory.BookFactory.createThirdBook;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        library.addAuthor(createOneAuthor());
        library.addAuthor(createSecondAuthor());
        library.addAuthor(createThirdAuthor());

        library.addBook(createOneBook());
        library.addBook(createSecondBook());
        library.addBook(createThirdBook());

        while (true) {
            System.out.print("\nDeseja ver os livros disponíveis ? (sim/não) ");
            String resposta = scanner.nextLine().toLowerCase();

            if (resposta.equals("sim")) {
                List<Book> booksAvailable = library.listBooks();

                if (booksAvailable.isEmpty()) {
                    System.out.println("Não existe livros");
                } else {
                    System.out.println();
                    for (Book book : booksAvailable) {
                        System.out.println(book.getId() + " - " + book.getTitle());
                    }
                }

                System.out.print("\nInforme o ID do livro para o empréstimo: ");
                Long id = scanner.nextLong();
                scanner.nextLine();

                Book bookChoice = library.searchBookById(id);

                if (bookChoice != null && bookChoice.isAvailable()) {
                    System.out.print("\nDigite o seu nome: ");
                    String nameUser = scanner.nextLine();

                    library.borrowBook(bookChoice, nameUser);
                    System.out.println("\nLivro: " + bookChoice.getTitle() + " foi emprestado para o(a) " + nameUser);
                } else {
                    System.out.println("Livro não encontrado ou indisponível");
                }
            } else if (resposta.equals("nao")) {
                System.out.println("\nSistema de Livraria, encerrado!");
                break;
            } else {
                System.out.println("\nOpção Inválida");
            }
        }
        scanner.close();
    }
}