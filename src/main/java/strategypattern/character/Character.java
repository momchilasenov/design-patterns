package strategypattern.character;

import strategypattern.behavior.WeaponBehavior;

public abstract class Character
{
  //Character HAS-A WeaponBehavior
  WeaponBehavior weaponBehavior;
  String name;

  public Character()
  {
  }

  public void fight()
  {
    weaponBehavior.useWeapon();
  }

  public void setWeaponBehavior(WeaponBehavior weaponBehavior)
  {
    this.weaponBehavior = weaponBehavior;
  }
}
