package snippet;

public class Snippet {
	@ManyToMany(mappedBy = "categories")
	private Set<Product> products = new HashSet<>();
}

