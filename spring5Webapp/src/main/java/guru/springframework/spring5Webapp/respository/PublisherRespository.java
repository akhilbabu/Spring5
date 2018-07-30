package guru.springframework.spring5Webapp.respository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5Webapp.model.publisher;

public interface PublisherRespository extends CrudRepository<publisher, Long> {

}
