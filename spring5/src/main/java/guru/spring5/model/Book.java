package guru.spring5.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

    @Data
//    @NoArgsConstructor
    @RequiredArgsConstructor
    @AllArgsConstructor
    @Entity
    public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String isbn;
    private String publisher;
    @ManyToMany
//            (fetch = FetchType.EAGER)
    @JoinTable(name = "author_book",joinColumns = @JoinColumn(name = "book_id"),inverseJoinColumns = @JoinColumn(name = "author_id"))//?
    private Set<Author> authors=new HashSet<>();

        public Book(String title, String isbn, String publisher) {
            this.title = title;
            this.isbn = isbn;
            this.publisher = publisher;
            this.authors = authors;
        }

        //    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getIsbn() {
//        return isbn;
//    }
//
//    public void setIsbn(String isbn) {
//        this.isbn = isbn;
//    }
//
//    public String getPublisher() {
//        return publisher;
//    }
//
//    public void setPublisher(String publisher) {
//        this.publisher = publisher;
//    }
//
//    public Set<Author> getAuthors() {
//        return authors;
//    }
//
//    public void setAuthors(Set<Author> authors) {
//        this.authors = authors;
//    }
}
