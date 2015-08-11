package com.maxboguslavskyi.bookstore.dao.impl;

import com.maxboguslavskyi.bookstore.dao.BookDao;
import com.maxboguslavskyi.bookstore.entity.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public long createBook(Book book) {
        Serializable id = sessionFactory.getCurrentSession().save(book);
        return (Long) id;
    }

    @Override
    public Book updateBook(Book book) {
        sessionFactory.getCurrentSession().update(book);
        return book;
    }

    @Override
    public Book getBook(long id) {
        return (Book) sessionFactory.getCurrentSession().get(Book.class, id);
    }

    @Override
    public List<Book> getAllBooks() {
        return sessionFactory.getCurrentSession().createCriteria(Book.class).list();
    }

    @Override
    public void deleteBook(long id) {
        Book book = new Book();
        book.setId(id);
        sessionFactory.getCurrentSession().delete(book);
    }
}
