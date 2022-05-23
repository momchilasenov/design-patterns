package factorymethod.restaurants;

import factorymethod.burgers.Burger;
import factorymethod.burgers.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant
{
  @Override
  public Burger createBurger()
  {
    return new VeggieBurger();
  }
}
