package factoryMethod;

public abstract class factory {

	public abstract AbstrProduct factoryMethod(); // abstract fact meth for polymorphism
	
    public AbstrProduct getProduct(){ AbstrProduct p = factoryMethod();//polymorphic call
                                      return p;}	
}
