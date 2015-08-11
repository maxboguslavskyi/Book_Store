package com.maxboguslavskyi.bookstore.service.impl;

import com.maxboguslavskyi.bookstore.service.BookService;
import com.maxboguslavskyi.bookstore.dao.BookDao;
import com.maxboguslavskyi.bookstore.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public long createBook(Book book) {
        return bookDao.createBook(book);
    }

    @Override
    public Book updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    @Override
    public Book getBook(long id) {
        return bookDao.getBook(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    @Override
    public void deleteBook(long id) {
        bookDao.deleteBook(id);
    }
}
