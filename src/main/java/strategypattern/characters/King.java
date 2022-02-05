package strategypattern.characters;

import strategypattern.weapons.SwordBehavior;

public class King extends Character
{
  public King()
  {
    weaponBehavior = new SwordBehavior();
  }
}
