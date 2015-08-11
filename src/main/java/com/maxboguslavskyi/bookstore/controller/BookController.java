package com.maxboguslavskyi.bookstore.controller;

import com.maxboguslavskyi.bookstore.service.BookService;
import com.maxboguslavskyi.bookstore.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("createBook")
    public ModelAndView createBook(@ModelAttribute Book book) {
        return new ModelAndView("bookForm");
    }

    @RequestMapping("editBook")
    public ModelAndView editBook(@RequestParam long id, @ModelAttribute Book book) {
        book = bookService.getBook(id);
        return new ModelAndView("bookForm", "bookObject", book);
    }

    @RequestMapping("saveBook")
    public ModelAndView saveBook(@ModelAttribute Book book) {
        if (book.getId() == 0) {
            bookService.createBook(book);
        } else {
            bookService.updateBook(book);
        }
        return new ModelAndView("redirect:getAllBooks");
    }

    @RequestMapping("deleteBook")
    public ModelAndView deleteBook(@RequestParam long id) {
        bookService.deleteBook(id);
        return new ModelAndView("redirect:getAllBooks");
    }

    @RequestMapping(value = {"getAllBooks", "/"})
    public ModelAndView getAllBooks() {
        List bookList = bookService.getAllBooks();
        return new ModelAndView("bookList", "bookList", bookList);
    }
}


