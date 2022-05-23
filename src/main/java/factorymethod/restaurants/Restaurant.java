package factorymethod.restaurants;

import factorymethod.burgers.Burger;

public abstract class Restaurant
{
  public Burger orderBurger()
  {
    Burger burger = createBurger();
    System.out.println("Created burger " + burger.getName());
    return burger;
  }

  //the factory method
  public abstract Burger createBurger();
}
