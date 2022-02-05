package introduction;

import introduction.fly.FlyBehavior;
import introduction.quack.QuackBehavior;

public abstract class Duck
{
  //Using composition. Duck is composed of FlyBehavior & QuackBehavior
  FlyBehavior   flyBehavior;
  QuackBehavior quackBehavior;
  String name;

  public Duck()
  {
  }

  public abstract void display();

  public void performFly()
  {
    //Duck doesn't handle fly behavior itself
    //it delegates that to the object referenced by FlyBehavior
    flyBehavior.fly();
  }

  public void performQuack()
  {
    //Duck doesn't handle quack behavior itself
    //it delegates that to the object referenced by QuackBehavior
    quackBehavior.quack();
  }

  public void setFlyBehavior(FlyBehavior flyBehavior)
  {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior)
  {
    this.quackBehavior = quackBehavior;
  }

}
