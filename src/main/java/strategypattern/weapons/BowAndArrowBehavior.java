package strategypattern.weapons;

public class BowAndArrowBehavior implements WeaponBehavior
{
  @Override
  public void useWeapon()
  {
    System.out.println("Bow and arrow behavior");
  }
}
