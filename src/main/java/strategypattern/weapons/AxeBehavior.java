package strategypattern.weapons;

public class AxeBehavior implements WeaponBehavior
{
  @Override
  public void useWeapon()
  {
    System.out.println("Axe behavior");
  }
}
