package andym;

public class Book extends PrintedEdition {
	private String title2;

	// double price, int year, String author

	public Book(String title, String title2, double price, int year, String author) {
		super(title,price, year, author);
		this.title2 = title2;
	}

	public String getTitle2() {
		return title2;
	}

	public void setTitle2(String title2) {
		this.title2 = title2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((title2 == null) ? 0 : title2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (title2 == null) {
			if (other.title2 != null)
				return false;
		} else if (!title2.equals(other.title2))
			return false;
		return true;
	}

	
}
