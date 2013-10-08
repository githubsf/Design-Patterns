package Builder;

import java.util.Arrays;

public class Pizza {

	public String dough;
	public String sauce;
	public String[] toppings;
	
	public void setDough(String s){this.dough=s;}
	public void setSauce(String s){this.sauce=s;}
	public void setToppings(String[] sarray){this.toppings=sarray;}
	
	public void show() {System.out.println( "Dough = " + dough + "\n" + "Sauce = " + sauce + "\ntoppings = "
	+ Arrays.asList(toppings).toString() + "\n"); }
}
