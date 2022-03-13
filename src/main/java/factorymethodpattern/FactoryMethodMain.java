package factorymethodpattern;

import factorymethodpattern.restaurants.BeefBurgerRestaurant;
import factorymethodpattern.restaurants.Restaurant;
import factorymethodpattern.restaurants.VeggieBurgerRestaurant;

public class FactoryMethodMain
{
  public static void main(String[] args)
  {
    Restaurant beefBurgerRestaurant = new BeefBurgerRestaurant();
    beefBurgerRestaurant.orderBurger();

    Restaurant veggieBurgerRestaurant = new VeggieBurgerRestaurant();
    veggieBurgerRestaurant.orderBurger();
  }

}
