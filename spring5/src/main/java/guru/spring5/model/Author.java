package guru.spring5.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.awt.print.Book;
import java.util.HashSet;
import java.util.Set;

    @Data
    @NoArgsConstructor
    @RequiredArgsConstructor
    @AllArgsConstructor
    @Entity
    public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String firstname;
    private String lastname;

    private Set<Book>books=new HashSet<>();
}
