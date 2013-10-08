package Builder;

// this is our Director in the Builder Pattern
public class Waiter {

	private PizzaBuilder b; //aggregation to the abstract builder class for polymorphism and delegation
	public void setBuilder(PizzaBuilder pb){this.b=pb;}
	
	public Pizza construct(){
		this.b.instantiatePizza();
		this.b.buildDough();
		this.b.buildSauce();
		this.b.buildToppings();
		return this.b.getPizza();}

	
}
