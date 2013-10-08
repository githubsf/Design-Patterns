package Builder;

//our AbstractBuilder
public abstract class PizzaBuilder {
private Pizza p;

/*
 * getPizza() since p is private so no one can build it w/o going 
 * through the Director.construct() meth.
 * instantiatePizza() since we need the Pizza to build parts for it.
 */
public Pizza getPizza(){return this.p;}
public Pizza instantiatePizza(){p=new Pizza();return p;}

/*
 * the 3 build...() are abstract, polymorphism to have the concrete subclasses 
 * build() methods have different ways of implementing
 */
public abstract void buildDough();
public abstract void buildSauce();
public abstract void buildToppings();
}
