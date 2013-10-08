package Builder;

public class Client {

	
	public static void main(String[] args) {
	
		// Build a Hawaiian Pizza
		System.out.println("Building a Hawaiian Pizza...");
		Waiter w = new Waiter(); // Our Director
		PizzaBuilder b = new Hawaiian(); // our builder
		w.setBuilder(b); 
		Pizza p = w.construct();
		System.out.println("Finished building a Hawaiian Pizza...");
		System.out.println("Showing the finished Hawaiian Pizza: \n");
		p.show();
		
		
		// Build a MeatLovers Pizza
		System.out.println("Building a Meat Lovers Pizza...");
		b= new MeatLovers();
		w.setBuilder(b);
		p = w.construct();
		System.out.println("Finished building a Meat Lovers Pizza...");
		System.out.println("Showing the finished Meat Lovers Pizza: \n");
		p.show();
		

	}

}
