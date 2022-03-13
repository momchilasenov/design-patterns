package factorymethodpattern.restaurants;

import factorymethodpattern.burgers.Burger;
import factorymethodpattern.burgers.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant
{
  @Override
  public Burger createBurger()
  {
    return new VeggieBurger();
  }
}
