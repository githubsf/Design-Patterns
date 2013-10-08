package Builder;

public class Hawaiian extends PizzaBuilder {

	@Override
	public void buildDough() {
		// TODO Auto-generated method stub
		this.getPizza().setDough("Thin");

	}

	@Override
	public void buildSauce() {
		// TODO Auto-generated method stub
		this.getPizza().setSauce("Pesto");
	}

	@Override
	public void buildToppings() {
		// TODO Auto-generated method stub
		this.getPizza().setToppings( new String[]{"Pineapple","Ham"});
	}

}
