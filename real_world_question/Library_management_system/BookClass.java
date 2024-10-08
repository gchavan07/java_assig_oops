package librayManagementSystem;

public class BookClass {
	
	private String title;
	private String author;
	private int ISBM;
	private int quantity;
	

	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getISBM() {
		return ISBM;
	}
	public void setISBM(int iSBM) {
		ISBM = iSBM;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "BookClass [title=" + title + ", author=" + author + ", ISBM=" + ISBM + ", quantity=" + quantity + "]";
	}

}
