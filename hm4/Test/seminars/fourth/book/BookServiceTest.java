package seminars.fourth.book;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {
    @Test
    void testFindBookByID() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        Book book = new Book("1", "The Three Body Problem", "Liu Cixin");
        when(bookRepository.findById("1")).thenReturn(book);

        Book result = bookService.findBookById("1");

        assertThat(result).isEqualTo(book);

    }
    @Test
    void testFindAllBooks() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        Book book1 = new Book("1", "The Three Body Problem", "Liu Cixin");
        Book book2 = new Book("2", "Sapiens", "Yuval Harari");
        when(bookRepository.findAll()).thenReturn(Arrays.asList(book1, book2));

        List<Book> result = bookService.findAllBooks();

        assertThat(result).isEqualTo(Arrays.asList(book1, book2));

    }
}