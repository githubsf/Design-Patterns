package Builder;

public class MeatLovers extends PizzaBuilder {

	@Override
	public void buildDough() {
		// TODO Auto-generated method stub
		this.getPizza().setDough("Thick");

	}

	@Override
	public void buildSauce() {
		// TODO Auto-generated method stub
		this.getPizza().setSauce("Tomato");
	}

	@Override
	public void buildToppings() {
		// TODO Auto-generated method stub
		this.getPizza().setToppings( new String[]{"Sausage","Pepperoni","Beef","Salami"});
	}

}
