public class HomeWork103{
	public static void main (String[] args){

		Book book = new Book( "笑傲江湖" ,  300);
		book.info();
		book.updatePrice();
		book.info();
	}
}
class Book {
	String name ;
	double price;
	public Book(String name , double price) {
		this.name = name;
		this.price = price;

	}
	public void updatePrice(){
		if(price > 150) {
			price = 150;
		}else if(price > 100) {
			price = 100;
		}
	}
	 public void info() {
	 	System.out.println("书名= " + this.name + "价格= " + this.price);
	 }
}
