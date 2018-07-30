package guru.springframework.spring5Webapp.respository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5Webapp.model.Author;

public interface AuthorRespository extends CrudRepository<Author, Long> {
}
