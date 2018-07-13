package guru.spring5.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

    @Data
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
}
