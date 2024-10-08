package librayManagementSystem;

public class MyMainClass {
	
	public static void main(String[] args) {
		
				
			 BookClass b1 = new BookClass();
			 b1.setTitle("Chaava");
			 b1.setAuthor("S.Sawant");
	         b1.setISBM(101);
	         b1.setQuantity(1);
	         
	         LibraryClass lib1 = new LibraryClass();
	         lib1.addbook(b1);
//	         lib1.display();
//	         System.out.println(b1.toString());
			 
		
	}
}
