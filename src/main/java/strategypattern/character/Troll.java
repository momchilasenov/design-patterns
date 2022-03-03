package strategypattern.character;

import strategypattern.behavior.AxeBehavior;

public class Troll extends Character
{
  public Troll()
  {
    weaponBehavior = new AxeBehavior();
  }
}
