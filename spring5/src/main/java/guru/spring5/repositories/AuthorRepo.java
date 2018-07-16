package guru.spring5.repositories;

import guru.spring5.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author,Long> {
}
