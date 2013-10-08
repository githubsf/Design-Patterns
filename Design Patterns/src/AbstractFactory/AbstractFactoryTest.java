package AbstractFactory;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class AbstractFactoryTest {
	private AbstractFactory af; // class under test, but since its abstract we can't use new

	@Before
	public void setUp() throws Exception {
		  
		/*
		 * here we define an anonymous inner class, to include all abstract methods
		 * of the abstract class under test, i.e AbstractFactory, so we can test the
		 * concrete methods of it. OR we can just forget about testing any abstract 
		 * class and only test its subclasses.
		 */
		// anonymous inner class defined here
		 af = new AbstractFactory(){ public AbstractProduct createProduct(){return null; };
		                           };
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateFactory() {
		final int WIN = 1;
	    final int UNIX = 2;
		//fail("Not yet implemented");
		AbstractFactory f = AbstractFactory.createFactory(WIN);
		assertNotNull("We should get a WinFactory and not a NULL", f);
		f = AbstractFactory.createFactory(UNIX);
		assertNotNull("We should get a UnixFactory and not a NULL", f);
		f = AbstractFactory.createFactory(3);
		assertNull("We should get a NULL whenever the factory does not know " +
				"of the int parameter passed to its constructor", f);
		
	}

	@Ignore("No need to test the abstract method createProduct()")
	@Test
		public void testCreateProduct() {
		fail("Not yet implemented");
	}

}
