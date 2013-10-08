package factoryPattern;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	AbstractProduct p = Factory.getProduct("ProductA");
	System.out.println(p.doSomething());
	

	}

}
