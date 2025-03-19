package kr.ac.kopo.hyun.bookmarket.repository;

import kr.ac.kopo.hyun.bookmarket.domain.Book;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepositoryImpl  implements BookRepository{
    private List<Book> listOfBooks = new ArrayList<Book>();

    public BookRepositoryImpl() {
        Book book1 = new Book();
        book1.setBookId("isbn0001");
        book1.setName("스프링부트완전정복");
        book1.setUniPrice(BigDecimal.valueOf(35000));
        book1.setAuthor("송미연");
        book1.setDescription("스프링 부트는 스프링을 기반으로 쉽고 빠르게 웹 애플리케이션을 개발할 수 있는 도구입니다. 이 책에서는 스프링 부트의 기본 개념을 쉽게 이해하고 다양한 실습 예제로 빠르게 익힐 수 있습니다. 그리고 단계별 실습을 따라 하다 보면 도서 쇼핑몰 구축 프로젝트를 완성할 수 있습니다. 개념-실습-프로젝트의 3단계 학습으로 스프링 부트를 제대로 익힌다면 개발 시간을 단축하고 생산성을 높일 수 있는 개발자로 성장할 수 있습니다.\n");
        book1.setPublisher("길벗캠퍼스");
        book1.setCategory("IT교재");
        book1.setUnitInstock(1000);
        book1.setReleaseDate("2024/12/31");
        book1.setCondition("신규도서");

        listOfBooks.add(book1);

        Book book2 = new Book();
        book2.setBookId("isbn0002");
        book2.setName("기계는 왜 학습하는가");
        book2.setUniPrice(BigDecimal.valueOf(22500));
        book2.setAuthor("아닐 아난타스와미");
        book2.setDescription("인공지능 공부 화이팅");
        book2.setUnitInstock(1000);
        book2.setReleaseDate("2024/12/31");
        book2.setCondition("중고도서");
        book2.setCategory("IT교양");

        listOfBooks.add(book2);


    }

    @Override
    public List<Book> getAllBookList() {
        return listOfBooks;
    }
}
