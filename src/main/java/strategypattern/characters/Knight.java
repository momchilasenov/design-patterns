package strategypattern.characters;

import strategypattern.weapons.KnifeBehavior;

public class Knight extends Character
{
  public Knight()
  {
    weaponBehavior = new KnifeBehavior();
  }
}
