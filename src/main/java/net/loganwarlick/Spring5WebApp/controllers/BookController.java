package net.loganwarlick.Spring5WebApp.controllers;

import net.loganwarlick.Spring5WebApp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getModel(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }
}
