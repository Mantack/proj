package guru.spring5.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

//    @Data
//    @NoArgsConstructor
    @RequiredArgsConstructor
    @AllArgsConstructor
    @Entity
    public class Author {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String firstname;
    private String lastname;
    @ManyToMany
//            (fetch = FetchType.EAGER, mappedBy = "authors")
            ( mappedBy = "authors")
    private Set<Book>books=new HashSet<>();

//


    public Author(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }


//        public Author(String firstname, String lastname) {
//
//        }


    }
