package decoratorpattern.decorators;

import decoratorpattern.Beverage;
import decoratorpattern.decorators.AddOnDecorator;

public class SugarDecorator extends AddOnDecorator
{
  private Beverage beverage; //IS-A and HAS-A beverage

  public SugarDecorator(Beverage beverage)
  {
    this.beverage = beverage;
  }

  @Override
  public String getDescription()
  {
    //returning the description of the wrapped object + sugar decorator description
    return this.beverage.getDescription() + " + Sugar";
  }

  @Override
  public int getCost()
  {
    System.out.println("Adding sugar");
    int wrappedBeverageCost = this.beverage.getCost();
    return wrappedBeverageCost + 9;
  }
}
