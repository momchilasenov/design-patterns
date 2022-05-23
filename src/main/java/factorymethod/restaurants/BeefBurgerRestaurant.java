package factorymethod.restaurants;

import factorymethod.burgers.BeefBurger;
import factorymethod.burgers.Burger;

public class BeefBurgerRestaurant extends Restaurant
{
  @Override
  public Burger createBurger()
  {
    return new BeefBurger();
  }
}
