package guru.springframework.spring5Webapp.bootStrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import guru.springframework.spring5Webapp.model.Author;
import guru.springframework.spring5Webapp.model.Book;
import guru.springframework.spring5Webapp.model.publisher;
import guru.springframework.spring5Webapp.respository.AuthorRespository;
import guru.springframework.spring5Webapp.respository.BookRespository;
import guru.springframework.spring5Webapp.respository.PublisherRespository;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {

	private AuthorRespository authorRespository;
	private BookRespository bookRespository;
	private PublisherRespository publisherRespository;

	public DevBootStrap(AuthorRespository authorRespository, BookRespository bookRespository,
			PublisherRespository publisherRespository) {
		super();
		this.authorRespository = authorRespository;
		this.bookRespository = bookRespository;
		this.publisherRespository = publisherRespository;
	}

	private void initData() {

		// eric
		Author eric = new Author("Eric", "Evans");
		publisher p1 = new publisher("akhil", "korkandy");
		Book book = new Book("domain driven design", "1234", p1);
		eric.getBooks().add(book);
		book.getAuthors().add(eric);


		publisherRespository.save(p1);
		authorRespository.save(eric);
		bookRespository.save(book);

		// RED
		Author red = new Author("red", "johnsons");
		publisher p = new publisher("athira", "kunnaru");
		Book notEjb = new Book("J2ee without ejb", "12", p);
		red.getBooks().add(notEjb);
		authorRespository.save(red);

		// eric.
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		initData();

	}

}
