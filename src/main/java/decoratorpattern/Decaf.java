package decoratorpattern;

public class Decaf extends Beverage
{
  @Override
  public String getDescription()
  {
    return "Decaf";
  }

  @Override
  public int getCost()
  {
    System.out.println("Decaf cost");
    return 2;
  }
}
