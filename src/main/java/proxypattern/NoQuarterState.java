package proxypattern;

public class NoQuarterState implements State
{
  private static final long serialVersionUID = 2L;
  transient GumballMachine gumballMachine; //don't serialize field

  @Override
  public void insertQuarter()
  {

  }

  @Override
  public void ejectQuarter()
  {

  }

  @Override
  public void turnCrank()
  {

  }

  @Override
  public void dispense()
  {

  }
}
