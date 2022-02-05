package introduction.fly;

public class FlyRocketPowered implements FlyBehavior
{
  @Override
  public void fly()
  {
    System.out.println("Rocket powered flying - it's a jet goose");
  }
}
