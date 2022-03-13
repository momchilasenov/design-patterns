package decoratorpattern;

import decoratorpattern.decorators.CaramelDecorator;
import decoratorpattern.decorators.SugarDecorator;

public class DecoratorMain
{
  public static void main(String[] args)
  {
    //Create espresso with caramel and sugar
    Beverage espresso2 = new CaramelDecorator(new SugarDecorator(new Espresso()));
    System.out.println(espresso2.getDescription());
    System.out.println(espresso2.getCost());

    System.out.println("---------------------");

    Beverage espresso = new Espresso();
    System.out.println(espresso.getDescription());
    System.out.println(espresso.getCost());

    System.out.println("---------------------");

    //Create espresso with caramel
    CaramelDecorator caramelDecorator = new CaramelDecorator(espresso);
    System.out.println(caramelDecorator.getDescription());
    System.out.println(caramelDecorator.getCost());

    System.out.println("---------------------");

    //add sugar to the espresso
    SugarDecorator sugarDecorator = new SugarDecorator(caramelDecorator);
    System.out.println(sugarDecorator.getDescription());
    System.out.println(sugarDecorator.getCost());

  }
}
