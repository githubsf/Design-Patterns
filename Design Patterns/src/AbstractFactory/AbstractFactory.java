package AbstractFactory;

/*
 * createFactory Code
 */
public abstract class AbstractFactory {

  private static final int WIN = 1;

  private static final int UNIX = 2;

  public static AbstractFactory createFactory(int os){
	  if (os==WIN) return new WinFactory();
	  if (os==UNIX) return new UnixFactory();
	  else  return null;
  }

  public abstract AbstractProduct createProduct();

}