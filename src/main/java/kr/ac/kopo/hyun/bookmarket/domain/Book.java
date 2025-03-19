package kr.ac.kopo.hyun.bookmarket.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
public class Book {
    private String bookId;//도서번호
    private String Name;//도서명
    private String author;//작가
    private BigDecimal uniPrice;//단가
    private String description;//도서 설명
    private String Publisher;//출판사
    private String category;//도서분류
    private long unitInstock;//재고량
    private String releaseDate;//출판일
    private String condition;//신규도서 or 중고도서

}
