package strategy.behavior;

public class BowAndArrowBehavior implements WeaponBehavior
{
  @Override
  public void useWeapon()
  {
    System.out.println("Bow and arrow behavior");
  }
}
