package introduction.quack;

public class MuteQuack implements QuackBehavior
{
  @Override
  public void quack()
  {
    System.out.println("Wooden duck - makes no sound at all");
  }
}
