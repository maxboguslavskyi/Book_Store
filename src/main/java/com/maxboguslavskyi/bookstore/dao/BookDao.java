package com.maxboguslavskyi.bookstore.dao;

import com.maxboguslavskyi.bookstore.entity.Book;

import java.util.List;

public interface BookDao {

    /*
     * CREATE and UPDATE
     */

    long createBook(Book book);

    Book updateBook(Book book);

    /*
     * READ
     */

    Book getBook(long id);

    List<Book> getAllBooks();

    /*
     * DELETE
     */

    void deleteBook(long id);

}
