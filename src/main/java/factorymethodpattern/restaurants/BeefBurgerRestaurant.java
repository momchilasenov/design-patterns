package factorymethodpattern.restaurants;

import factorymethodpattern.burgers.BeefBurger;
import factorymethodpattern.burgers.Burger;

public class BeefBurgerRestaurant extends Restaurant
{
  @Override
  public Burger createBurger()
  {
    return new BeefBurger();
  }
}
