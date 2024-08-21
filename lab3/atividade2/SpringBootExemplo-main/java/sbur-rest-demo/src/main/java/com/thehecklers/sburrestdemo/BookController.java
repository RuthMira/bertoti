package com.thehecklers.sburrestdemo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private List<Book> books = new ArrayList<>();

    public BookController() {
        books.addAll(List.of(
                new Book("1984", "George Orwell"),
                new Book("To Kill a Mockingbird", "Harper Lee"),
                new Book("The Graeat Gatsby", "F. Scott Fitzgerald")
        ));
    }

    @GetMapping
    Iterable<Book> getBooks() {
        return books;
    }

    @GetMapping("/{id}")
    Book getBookById(@PathVariable String id) {
        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Book not found"));
    }

    @PostMapping
    Book postBook(@RequestBody Book book) {
        books.add(book);
        return book;
    }

    @PutMapping("/{id}")
    Book putBook(@PathVariable String id, @RequestBody Book book) {
        int bookIndex = -1;

        for (Book b : books) {
            if (b.getId().equals(id)) {
                bookIndex = books.indexOf(b);
                books.set(bookIndex, book);
                break;
            }
        }

        return (bookIndex == -1) ? postBook(book) : book;
    }

    @DeleteMapping("/{id}")
    void deleteBook(@PathVariable String id) {
        books.removeIf(book -> book.getId().equals(id));
    }
}
