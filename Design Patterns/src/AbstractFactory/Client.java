package AbstractFactory;

/*
 * Client Code
 */
public class Client {

  public static void main(String[] args){
	  // the factory type(1 or 2) is decided at runtime
// Windows os=1
	/*
	 * SINCE AbstractFactory is an Interface or Abstract class
	 * you can not instantiate it, so provide a static createFactory(int os)
	 * in it so you can create an instance of it.
	 */
  AbstractFactory f= AbstractFactory.createFactory(1);
  AbstractProduct p = f.createProduct();
   System.out.println(p.doSomething());
   
   // Unix os=2
   f= AbstractFactory.createFactory(2);
   p = f.createProduct();
    System.out.println(p.doSomething());
  
  }
}