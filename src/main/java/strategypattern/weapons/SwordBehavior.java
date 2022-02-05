package strategypattern.weapons;

public class SwordBehavior implements WeaponBehavior
{
  @Override
  public void useWeapon()
  {
    System.out.println("Sword behavior");
  }
}
