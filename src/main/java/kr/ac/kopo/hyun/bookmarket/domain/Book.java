package kr.ac.kopo.hyun.bookmarket.domain;

import lombok.Getter;
import jakarta.validation.constraints.Pattern;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
public class Book {
    @Pattern(regexp = "^[A-Za-z0-9]{10}$") // Example regex: validates alphanumeric strings of exactly 10 characters
    private String bookId;//도서번호
    @Size(min =3, max =50)
    private String Name;//도서명
    @Min(0)
    @Digits(integer = 8, fraction= 2)
    @NotNull
    private String author;//작가
    private BigDecimal uniPrice;//단가
    private String description;//도서 설명
    private String Publisher;//출판사
    private String category;//도서분류
    private long unitInstock;//재고량
    private String releaseDate;//출판일
    private String condition;//신규도서 or 중고도서
    private String fileName;//도서 이미지 파일 저장
    private MultipartFile bookImage; //업로드된 도서 이미지 파일




}
