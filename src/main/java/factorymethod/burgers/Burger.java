package factorymethod.burgers;

public class Burger
{
  private String name;
  private double price;

  public String getName()
  {
    return name;
  }

  public Burger setName(String name)
  {
    this.name = name;
    return this;
  }

  public double getPrice()
  {
    return price;
  }

  public Burger setPrice(double price)
  {
    this.price = price;
    return this;
  }
}
