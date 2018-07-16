package guru.spring5.repositories;

import guru.spring5.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book,Long> {
}
