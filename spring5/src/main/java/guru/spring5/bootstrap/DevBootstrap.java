package guru.spring5.bootstrap;

import guru.spring5.model.Author;
import guru.spring5.model.Book;
import guru.spring5.repositories.AuthorRepo;
import guru.spring5.repositories.BookRepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

//@AllArgsConstructor
@Data
@Component
public class DevBootstrap  implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepo authorRepo;
    private BookRepo bookRepo;

    public DevBootstrap(AuthorRepo authorRepo, BookRepo bookRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
    initData();
    }

    private void initData(){

        //Eric
        Author eric=new Author("Eric","Evans");
        Book ddd=new Book("Domain Driven Dizain","1234","harper Collins");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepo.save(eric);
        bookRepo.save(ddd);

    //Rod
    Author rod=new Author("Rod","Johnson");
    Book noEjb=new Book("J2EE Development without EJB","23444","Worx");
 rod.getBooks().add(noEjb);
 noEjb.getAuthors().add(rod);
   authorRepo.save(rod);
   bookRepo.save(noEjb);
}
}