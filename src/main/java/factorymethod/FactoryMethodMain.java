package factorymethod;

import factorymethod.restaurants.BeefBurgerRestaurant;
import factorymethod.restaurants.Restaurant;
import factorymethod.restaurants.VeggieBurgerRestaurant;

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
