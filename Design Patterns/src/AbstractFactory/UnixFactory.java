package AbstractFactory;

public class UnixFactory extends AbstractFactory {

  public AbstractProduct createProduct() {
  return new UnixProduct();
  }

}