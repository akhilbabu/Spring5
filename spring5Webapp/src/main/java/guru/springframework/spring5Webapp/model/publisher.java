package guru.springframework.spring5Webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GeneratorType;

@Entity
public class publisher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String name;
	
	@Column
	private String address;
	
	@OneToOne(mappedBy="publisher")
	private Book book;
	
	
	
	
	
	

	@Override
	public String toString() {
		return "publisher [id=" + id + ", name=" + name + ", address=" + address + ", book=" + book + "]";
	}

	public publisher(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
