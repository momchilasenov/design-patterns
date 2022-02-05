package strategypattern.characters;

import strategypattern.weapons.AxeBehavior;

public class Troll extends Character
{
  public Troll()
  {
    weaponBehavior = new AxeBehavior();
  }
}
