package factoryMethod;

public class Client {

	
	public static void main(String[] args) {
		
		// the concFactory classes must be known at compile time 
		// as the client will need to use new to get a factory
		// and the Factory class is abstract and not instantiatable
		// so the client needs to use new concFactxxx() to get 
		// a factory. We also do not have a static method is our
		// factory class like in the "Factory pattern" getProduct()
		// so instantiation is necessary and causes HIGH COUPLING
		// with the Client. USE "Factory Pattern" for dynamic real time
		// injection of concrete products you need. Factory method is
		// restraint at compile time.
		// In "FACTORY PATTERN" you do not have concFactxxx classes 
		// you pass in the type of concrete product you want as a 
		// parameter to the static method getProduct(String p_type),
		// and since this method is static you do not need to instantiate
		// the factory before using it. 
		factory f = new concFactoryA();
		AbstrProduct p = f.getProduct();
		System.out.println(p.doIt());
		
		 f = new concFactoryB();
		 p = f.getProduct();
		System.out.println(p.doIt());
		
	}

}
