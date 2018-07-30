package guru.springframework.spring5Webapp.respository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5Webapp.model.Book;

public interface BookRespository extends CrudRepository<Book, Long> {

}
