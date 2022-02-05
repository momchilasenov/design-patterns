package strategypattern.characters;

import strategypattern.weapons.WeaponBehavior;

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
