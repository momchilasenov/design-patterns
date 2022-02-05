package introduction;

import introduction.fly.FlyRocketPowered;

public class Main
{
  public static void main(String[] args)
  {
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
    mallard.display();

    System.out.println("---------------");

    Duck model = new ModelDuck();
    model.performQuack();
    model.performFly();
    //Changing the fly behavior of the duck dynamically
    //You can't do that if the implementation lives inside Duck class
    model.setFlyBehavior(new FlyRocketPowered());
    model.display();

  }
}
