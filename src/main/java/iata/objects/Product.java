package iata.objects;

public class Product {

	private final long id;
	private final String content;

	public Product(final long id, final String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

}
