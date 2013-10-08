package AbstractFactory;

public class WinFactory extends AbstractFactory {

  public AbstractProduct createProduct() {
  return new WinProduct();
  }

}