package decoratorpattern;

public class Espresso extends Beverage
{
  @Override
  public String getDescription()
  {
    return "Espresso";
  }

  @Override
  public int getCost()
  {
    System.out.print("Espresso cost: ");
    return 2;
  }
}
