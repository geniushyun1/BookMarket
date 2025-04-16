package kr.ac.kopo.hyun.bookmarket.Controller;


import kr.ac.kopo.hyun.bookmarket.Service.BookService;
import kr.ac.kopo.hyun.bookmarket.domain.Book;
import kr.ac.kopo.hyun.bookmarket.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
    @GetMapping("/book")
    public String requestBookById(@RequestParam("id") String bookId, Model model){
        Book book = bookService.getBookById(bookId);
        model.addAttribute("book", book);

        return "book";
    }

    @GetMapping("/{category}")
    public String requestBookByCategory(@PathVariable("category")String category, Model model){
        List<Book> booksByCategory = bookService.getAllBookList();
        model.addAttribute("bookList", booksByCategory);
        return "books";
    }


}
