package irene;


class Book{
	String title;
	String author;
	double price;
	int quantity;
	Book(String title,String author,double price,int quantity){
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
		
	}

	public double calculateTotal() {
	return (price*quantity);
}
	public void displayDetails() {
		System.out.println("Title" + title);
		System.out.println("Author" + author);
		System.out.println("Price" + price);
		System.out.println("Quantity" + quantity);
		
		System.out.println("Total value" +calculateTotal());
	}
}
	public class Basics12 {
		public static void main(String[] args) {
			Book Book1=new Book("Alchemist","Paulo Coelho",100,50);
			Book Book2=new Book("Beloved","Toni Morrison",250,50);
			Book1.displayDetails();
			Book2.displayDetails();
			
		}
	}



