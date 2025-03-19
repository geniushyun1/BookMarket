package kr.ac.kopo.hyun.bookmarket.Controller;


import kr.ac.kopo.hyun.bookmarket.Service.BookService;
import kr.ac.kopo.hyun.bookmarket.domain.Book;
import kr.ac.kopo.hyun.bookmarket.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;


    @RequestMapping(value = "./books", method= RequestMethod.GET)
    public String requestBookList(Model model) {
        List<Book> bookList = bookService.getAllBookList();
        model.addAttribute("bookList", bookList);
        return "books";
    }
}
