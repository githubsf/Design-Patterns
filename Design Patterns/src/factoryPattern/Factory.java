package factoryPattern;

public class Factory {
	
public static AbstractProduct getProduct(String s){
	if (s.equalsIgnoreCase("ProductA")) return new ProductA();
	if (s.equalsIgnoreCase("ProductB")) return new ProductB();
	return null;
	
}
}
