package com.greenlearner.LibraryApplication.services;

import com.greenlearner.LibraryApplication.Entities.Book;
import com.greenlearner.LibraryApplication.dao.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    private static List<Book> list = new ArrayList<>();



    //get all books
    public List<Book> getAllBooks() {
        List<Book> allBooks = (List<Book>)this.bookRepository.findAll();
        return allBooks;
    }

    public Book getSingleBookById(int id) {
        Book book = bookRepository.findById(id);
        return book;
    }


    //        adding the book
    public Book addBook(Book b) {
        bookRepository.save(b);
        return b;
    }

    //        deleting the book
    public void deleteBook(int b_id) {
        bookRepository.deleteById(b_id);
    }

    //    update the book
    public void updateBookByid(Book book, int bookId){
        book.setId(bookId);
        bookRepository.save(book);

    }
}
