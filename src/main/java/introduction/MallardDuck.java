package introduction;

import introduction.fly.FlyWithWings;
import introduction.quack.Quack;

public class MallardDuck extends Duck
{
  public MallardDuck()
  {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  @Override
  public void display()
  {
    System.out.println("I am a MallardDuck - a real one");
  }
}
