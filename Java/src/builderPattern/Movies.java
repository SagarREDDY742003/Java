package builderPattern;

public class Movies {
	int id;
	String name;
	int rating;

	public Movies setId(int id) {
		this.id = id;
		return this;
	}

	public Movies setName(String name) {
		this.name = name;
		return this;
	}

	public Movies setRating(int rating) {
		this.rating = rating;
		return this;
	}

	@Override
	public String toString() {
		return "Movies [id=" + id + ", name=" + name + ", rating=" + rating + "]";
	}

}
