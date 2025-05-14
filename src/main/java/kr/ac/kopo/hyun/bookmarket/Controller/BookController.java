package kr.ac.kopo.hyun.bookmarket.Controller;

import jakarta.servlet.http.HttpServletResponse;
import kr.ac.kopo.hyun.bookmarket.Service.BookService;
import kr.ac.kopo.hyun.bookmarket.domain.Book;
import org.springframework.beans.factory.annotation.Value;

import java.io.FileInputStream;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.OutputStream;
import java.util.List;

@RequestMapping(value = "/books")
@Controller
public class BookController {

    @Autowired
    private BookService bookService;
    @Value("${file.uploadDir}")
    String fileDir;


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
    public String requestBookById(@RequestParam("id") String bookId, Model model) {
        Book book = bookService.getBookById(bookId);
        model.addAttribute("book", book);
        return "book";
    }

    @GetMapping("/{category}")
    public String requestBookByCategory(@PathVariable("category") String category, Model model) {
        List<Book> booksByCategory = bookService.getAllBookList(); // TODO: 필터링 필요
        model.addAttribute("bookList", booksByCategory);
        return "books";
    }

    @GetMapping("/add")
    public String requestAddBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "addBook";
    }

    @PostMapping("/add")
    public String requestSubmitNewBook(@Valid @ModelAttribute("book") Book book, BindingResult bindingResult) {



        MultipartFile file = book.getBookImage();
        String saveName = file.getOriginalFilename();
        File saveFile = new File(fileDir + saveName);
        if (file != null && !file.isEmpty()) {
            try {
                file.transferTo(saveFile);
            } catch (IOException e) {
                throw new RuntimeException("도서 이미지가 업로드가 되지 않았습니다");
            }
        }
        return "redirect:/books";
    }
    @GetMapping("/download")
    public void downloadBookImage(@RequestParam("fileName") String paramKey, HttpServletResponse response) throws IOException {
        File imageFile = new File(fileDir + paramKey);
        response.setContentType("application/download");
        response.setHeader("Content-Disposition","attachment; filename=" + paramKey + "\"");
        response.setContentLength((int) imageFile.length());
        OutputStream os = response.getOutputStream();
        FileInputStream fis = new FileInputStream(imageFile);
        FileCopyUtils.copy(fis, os);
        fis.close();
        os.close();

        }

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("addTitle", "Add New Book");
    }
}
