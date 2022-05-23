package decorator.decorators;

import decorator.Beverage;

public class CaramelDecorator extends AddOnDecorator
{
  private Beverage beverage; //IS-A and HAS-A beverage

  public CaramelDecorator(Beverage beverage)
  {
    this.beverage = beverage;
  }

  @Override
  public String getDescription()
  {
    return this.beverage.getDescription() + " + Caramel";
  }

  @Override
  public int getCost()
  {
    System.out.println("Adding caramel");
    int wrappedBeverageCost = this.beverage.getCost();
    return wrappedBeverageCost + 2;
  }
}
