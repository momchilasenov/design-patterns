package decorator.decorators;

import decorator.Beverage;

//Decorator IS-A beverage and it HAS-A beverage
public abstract class AddOnDecorator extends Beverage
{
  public abstract String getDescription();

  public abstract int getCost();
}
