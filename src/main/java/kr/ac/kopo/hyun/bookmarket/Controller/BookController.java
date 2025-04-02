package kr.ac.kopo.hyun.bookmarket.Controller;


import kr.ac.kopo.hyun.bookmarket.Service.BookService;
import kr.ac.kopo.hyun.bookmarket.domain.Book;
import kr.ac.kopo.hyun.bookmarket.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@RequestMapping(value = "/books")
@Controller
public class BookController {
    @Autowired
    private BookService bookService;


    @GetMapping
    public String requestBookList(Model model) {
        List<Book> bookList = bookService.getAllBookList();
        model.addAttribute("bookList", bookList);
        return "books";
    }

    @GetMapping("/all")
    public ModelAndView requestAllBookList(Model model) {
        ModelAndView modelV = new ModelAndView();
        modelV.setViewName("books");
        List<Book> bookList = bookService.getAllBookList();
        model.addAttribute("bookList", bookList);
        return modelV;
    }
}
